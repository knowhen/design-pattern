package com.when.design_pattern.proxy_pattern.virtual_proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author: when
 * @create: 2019-06-18  15:35
 * @Description: TODO:
 **/
public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    private URL imageURL;
    private Thread thread;
    private boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        if (checkImageIcon()) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (checkImageIcon()) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (checkImageIcon()) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading...", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                thread = new Thread(() -> {
                    try {
                        thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        setImageIcon(new ImageIcon(imageURL, "CD Cover"));
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
            }
        }
    }

    private boolean checkImageIcon() {
        return imageIcon != null;
    }
}
