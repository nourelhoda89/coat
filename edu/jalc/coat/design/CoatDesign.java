package edu.jalc.coat.design;


import edu.jalc.coat.color.RGBColor;
import edu.jalc.coat.type.ParkaType;

public class CoatDesign {

   private final RGBColor rgbColor;
   private final ParkaType parkaType;

   public CoatDesign(){
   
      this.rgbColor = null;
      this.parkaType = null;
   }

   public CoatDesign(RGBColor rgbColor,ParkaType parkaType){
      this.rgbColor = rgbColor;
      this.parkaType= parkaType;
   }

   public RGBColor getRgbColor(){
      return rgbColor;
   }
   public ParkaType getParkaType(){
      return parkaType;
   }
}
