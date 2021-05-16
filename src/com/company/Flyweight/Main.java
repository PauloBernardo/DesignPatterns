package com.company.Flyweight;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;

    JButton startDrawing;

    int windowWidth = 400;
    int windowHeight = 360;

    Color[] shapeColor = {Color.orange, Color.red, Color.yellow,
            Color.blue, Color.pink, Color.cyan, Color.magenta,
            Color.black, Color.gray};

    public static void main(String[] args) {
        System.out.println("Design Pattern Flyweight");

        new Main();
    }

    public Main(){

        this.setSize(windowWidth,windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();

        contentPane.setLayout(new BorderLayout());

        final JPanel  drawingPanel  = new JPanel();

        startDrawing = new JButton("Button 1");

        contentPane.add(drawingPanel,  BorderLayout.CENTER);

        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(event -> {
            Graphics g = drawingPanel.getGraphics();

            long startTime = System.currentTimeMillis();


            for(int i=0; i < 100000; ++i) {

                MyOldRect rect = new MyOldRect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
                rect.draw(g);

                g.setColor(getRandColor());
                g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());

            }

            long endTime = System.currentTimeMillis();

            System.out.println("Old version took " + (endTime - startTime) + " milliseconds");

            startTime = System.currentTimeMillis();


            for(int i=0; i < 100000; ++i) {

                MyRect rect = RectFactory.getRect(getRandColor());
                rect.draw(g, getRandX(), getRandY(),
                        getRandX(), getRandY());

            }

            endTime = System.currentTimeMillis();

            System.out.println("New version took " + (endTime - startTime) + " milliseconds");

            System.exit(0);

        });

        this.add(contentPane);

        this.setVisible(true);

        startDrawing.doClick();

    }

    private int getRandX(){ return (int)(Math.random()*windowWidth); }

    private int getRandY(){ return (int)(Math.random()*windowHeight); }

    private Color getRandColor(){
        Random randomGenerator = new Random();

        int randInt = randomGenerator.nextInt(9);

        return shapeColor[randInt];

    }
}