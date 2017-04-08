package edu.jalc.coat.color;

public class RGBColor {
   private final int red;
   private final int green;
   private final int blue;

   private RGBColor(){
      this.red = this.green = this.blue = 0;
   }

   public RGBColor(int red, int green, int blue){
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public int getRed() {
      return red;
   }

   public int getGreen() {
      return green;
   }

   public int getBlue() {
      return blue;
   }
}