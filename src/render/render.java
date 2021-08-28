package src.render;

import javax.swing.JFrame;

public class render {

    public static void makeJFrame(String title, int width, int height, boolean maximized) {
        JFrame frame = new JFrame();
        if (maximized) {
            frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        }
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Newport Crawler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
