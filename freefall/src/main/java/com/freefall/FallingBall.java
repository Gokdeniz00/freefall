package com.freefall;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FallingBall extends JPanel{
    int pos_x;
    int pos_y;
    int velocity;
    int acceleration;
    boolean stopped;

    public FallingBall(){
        pos_x=0;
        pos_y=0;
        velocity=0;
        acceleration=98;
        stopped=false;
        final Timer[] timer = new Timer[1]; 
        ActionListener action = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if ((velocity+1<630-pos_y)&&stopped==false){           
                        velocity+=1;
                        pos_y+=velocity;//Increase the vertical velocity of the ball
                        repaint();// Redraw the ball at the new position
                    }if((velocity+1>630-pos_y)&&stopped==false){
                        velocity=630-(pos_y);
                        pos_y+=velocity;
                        stopped=true;
                        
                        repaint();
                        timer[0].stop();
                    }
                }
        };
        timer[0] = new Timer(1, action);
        timer[0].start();
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(150, pos_y, 10, 10); // Draw the ball
    }
}