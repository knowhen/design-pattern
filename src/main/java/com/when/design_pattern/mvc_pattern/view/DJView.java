package com.when.design_pattern.mvc_pattern.view;

import com.when.design_pattern.mvc_pattern.controller.ControllerInterface;
import com.when.design_pattern.mvc_pattern.domain.BeatBar;
import com.when.design_pattern.mvc_pattern.domain.BeatObserver;
import com.when.design_pattern.mvc_pattern.domain.BpmObserver;
import com.when.design_pattern.mvc_pattern.model.BeatModelInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TODO
 *
 * @author when
 * @date 2019/6/22 16:18
 */
public class DJView implements ActionListener, BeatObserver, BpmObserver {
    private BeatModelInterface model;
    private ControllerInterface controller;

    private JFrame viewFrame;
    private JPanel viewPanel;
    private BeatBar beatBar;
    private JLabel bpmOutputLabel;

    private JFrame controlFrame;
    private JPanel controlPanel;
    private JLabel bpmLabel;
    private JTextField bpmTextField;
    private JButton setBpmButton;
    private JButton increaseBpmButton;
    private JButton decreaseBpmButton;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem startMenuItem;
    private JMenuItem stopMenuItem;

    public DJView(ControllerInterface controller, BeatModelInterface model) {
        this.model = model;
        this.controller = controller;
        model.registerObserver((BeatObserver) this);
        model.registerObserver((BpmObserver) this);
    }

    public void createView() {
        viewPanel = new JPanel(new GridLayout(1, 2));
        viewFrame = new JFrame("view");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(100, 80));
        bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
        beatBar = new BeatBar();
        beatBar.setValue(0);
        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        //bpmPanel.add(beatBar);
        bpmPanel.add(bpmOutputLabel);
        viewPanel.add(bpmPanel);
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setVisible(true);

    }

    public void createControls() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(100, 80));

        controlPanel = new JPanel(new GridLayout(1, 2));

        // start,stop,exit menu item
        startMenuItem = new JMenuItem("Start");
        startMenuItem.addActionListener(e -> controller.start());
        stopMenuItem = new JMenuItem("Stop");
        stopMenuItem.addActionListener(e -> controller.stop());
        JMenuItem exit = new JMenuItem("Quit");
        exit.addActionListener(e -> System.exit(0));

        menu = new JMenu("DJ Control");
        menu.add(startMenuItem);
        menu.add(stopMenuItem);
        menu.add(exit);

        menuBar = new JMenuBar();
        menuBar.add(menu);

        controlFrame.setJMenuBar(menuBar);

        // other component
        bpmTextField = new JTextField(2);
        bpmLabel = new JLabel("Enter bpm: ", SwingConstants.RIGHT);

        setBpmButton = new JButton("Set");
        setBpmButton.setSize(new Dimension(10, 40));
        setBpmButton.addActionListener(this);

        increaseBpmButton = new JButton(">>");
        increaseBpmButton.addActionListener(this);

        decreaseBpmButton = new JButton("<<");
        decreaseBpmButton.addActionListener(this);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(decreaseBpmButton);
        buttonPanel.add(increaseBpmButton);

        JPanel enterPanel = new JPanel(new GridLayout(1, 2));
        enterPanel.add(bpmLabel);
        enterPanel.add(bpmTextField);

        JPanel insideControlPanel = new JPanel(new GridLayout(3, 1));
        insideControlPanel.add(enterPanel);
        insideControlPanel.add(setBpmButton);
        insideControlPanel.add(buttonPanel);

        controlPanel.add(insideControlPanel);

        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        bpmOutputLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        controlFrame.getRootPane().setDefaultButton(setBpmButton);
        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);

        controlFrame.pack();
        controlFrame.setVisible(true);

    }

    public void enableStopMenuItem() {
        stopMenuItem.setEnabled(true);
    }

    public void disableStopMenuItem() {
        stopMenuItem.setEnabled(false);
    }

    public void enableStartMenuItem() {
        startMenuItem.setEnabled(true);
    }

    public void disableStartMenuItem() {
        startMenuItem.setEnabled(false);
    }

    public void updateBpm() {
        if (model != null) {
            int bpm = model.getBpm();
            if (bpm == 0) {
                if (bpmOutputLabel != null) {
                    bpmOutputLabel.setText("offline");
                }
            } else {
                if (bpmOutputLabel != null) {
                    bpmOutputLabel.setText("current bpm: " + bpm);
                }
            }
        }
    }

    public void updateBeat() {
        beatBar.setValue(100);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == setBpmButton) {
            String text = bpmTextField.getText();
            int bpm;
            try {
                bpm = Integer.parseInt(text);
                controller.setBpm(bpm);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "输入错误", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == increaseBpmButton) {
            controller.increaseBpm();
        } else if (e.getSource() == decreaseBpmButton) {
            controller.decreaseBpm();
        }
    }
}
