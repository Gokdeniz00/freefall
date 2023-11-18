package com.freefall;
import javax.swing.JFrame;
import javax.swing.JButton;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        JButton dropballButton =new JButton("Drop the ball");
        dropballButton.setBounds(50,100,95,30);
        frame.add(dropballButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        //frame add 
    }
}