package src.render;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame() {
        initialize();
    }

    public void initialize() {
        setTitle("Newport Crawler");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

}
