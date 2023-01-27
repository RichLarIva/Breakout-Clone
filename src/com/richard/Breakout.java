package com.richard;

import javax.swing.JFrame;
import java.awt.*;

public class Breakout extends JFrame
{
    public Breakout()
    {
        initUI();
    }

    public void initUI()
    {
        add(new Board(), BorderLayout.CENTER);
        setTitle("Richard's Breakout");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);
        pack();
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            var game = new Breakout();
            game.setVisible(true);
        });
    }
}
