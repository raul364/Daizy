package com.daizy.core.gui;

import javax.swing.*;

public class GUI extends JFrame {

    public GUI(String name) {
        setTitle(name);
        setVisible(true);
        setSize(200,200);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
