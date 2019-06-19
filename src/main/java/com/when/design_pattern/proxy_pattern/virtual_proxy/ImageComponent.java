package com.when.design_pattern.proxy_pattern.virtual_proxy;

import javax.swing.*;
import java.awt.*;

/**
 * @author: when
 * @create: 2019-06-18  15:51
 * @Description: TODO:
 **/
public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w) / 2;
        int y = (600 - h) / 2;
        icon.paintIcon(this, g, x, y);
    }
}
