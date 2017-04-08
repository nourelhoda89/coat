package edu.jalc.coat.builders;

import edu.jalc.coat.coat.Coat;
import edu.jalc.coat.color.RGBColor;
import edu.jalc.coat.accessories. CoatAccessories;
import edu.jalc.coat.design.CoatDesign;
import edu.jalc.coat.hat.CoatHat;
import edu.jalc.coat.zipper.CoatZipper;

public class  ParkaCoatBuilder implements  ParkaCoatBuilderInterface{

   String hatStatus,hatSize,zipperSize,color;
   
   RGBColor rgbColor;
   CoatAccessories accessories;
   CoatHat coatHat;
   CoatZipper coatZipper;
   CoatDesign design;
   
   public static  ParkaCoatBuilder newBuilder(){
      return new  ParkaCoatBuilder();
   }
   public ParkaCoatBuilderInterface withoutHat(){
      hatStatus="Without hat";   
      return this;
   }
   public ParkaCoatBuilderInterface withHat(){
      hatStatus="With hat";     
      return this;
   }
   public ParkaCoatBuilderInterface  hasLargeHat(){
      hatSize="Large hat";
      return this;
   }
   public  ParkaCoatBuilderInterface hasSmallHat(){
      hatSize="Small hat";
      return this;
   }
   public ParkaCoatBuilderInterface hasLongZipper(){
      zipperSize="Long zipper";
      return this;
   }
   public ParkaCoatBuilderInterface hasShortZipper(){
      zipperSize="Short zipper";
      return this;
   }
    
   public ParkaCoatBuilderInterface inOliveGreenColor(){
      color="Olive green color";
      return this;
   }
   
   public ParkaCoatBuilderInterface inAzureColor(){
      color ="Azure color";
      return this;
   }
  
   public Coat build() throws Exception{
   
      switch(hatStatus ){
         case "Without hat":  coatHat= new CoatHat(0.0);
            break;
         case "With hat":
         
            switch(hatSize){
               case "Large hat": coatHat= new CoatHat(15.0);
                  break;
               case "Small hat": coatHat= new CoatHat(10.0);
                  break;
            //default: throw new Exception("You have to pick either a small or a large hat");
            }
            break;
         //default: throw new Exception("Must choose with or without a hat");
      }
      switch(zipperSize){
         case "Long Zipper":coatZipper=new CoatZipper(100.0);
            break;
         case "Short zipper":coatZipper=new CoatZipper(80.0);
            break;
         //default:throw new Exception("You have to pick either a short or a long zipper");
      
      }
      switch(color){
         case "Olive green color":rgbColor= new RGBColor(85,107,47);
            break;
         case "Azure color":rgbColor= new RGBColor(0,127,255);
            break;
         default: throw new Exception("Your coat needs a color!!");
      }
      
      accessories=new CoatAccessories(coatHat,coatZipper);
      design=new  CoatDesign(rgbColor,null);
      
      return new Coat(accessories, design);
   }
//just for testing
   public static void main(String...args) throws Exception{
      ParkaCoatBuilder builder = new ParkaCoatBuilder();
      Coat girlsCoat = builder.withHat().hasSmallHat().hasLongZipper().inAzureColor().build();
   
   }
}