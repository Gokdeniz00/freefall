package com.freefall;

import java.awt.Color;
import java.awt.Graphics;

//import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FallingBall extends JPanel{
    int pos_x;
    int pos_y;
    int velocity;
    int acceleration;
    int updateinterval;

    public FallingBall(){
        pos_x=0;
        pos_y=0;
        velocity=0;
        acceleration=98;
        updateinterval=1/acceleration*1000;
        
    }
    public void Fall() {
        Timer timer = new Timer(updateinterval, e -> {
            pos_y += 1/velocity;// Increase the vertical position of the ball
            velocity+=1/acceleration;//Increase the vertical velocity of the ball
             
            repaint(); // Redraw the ball at the new position
        });
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(100, pos_y, 50, 50); // Draw the ball
    }
}