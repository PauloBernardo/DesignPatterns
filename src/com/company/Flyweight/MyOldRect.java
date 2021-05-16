package com.company.Flyweight;

import java.awt.*;

public class MyOldRect {
    private final Color color;
    private final int x, y, x2, y2;

   public MyOldRect(Color color, int upperX, int upperY, int lowerX, int lowerY) {
      this.color = color;
      this.x = upperX;
      this.y = upperY;
      this.x2 = lowerX;
      this.y2 = lowerY;
   }

   public void draw(Graphics g) {
      g.setColor(color);
      g.fillRect(x, y, x2, y2);
   }
}