package edu.jalc.coat.builders;

import edu.jalc.coat.coat.Coat;
import edu.jalc.coat.color.RGBColor;
import edu.jalc.coat.accessories. CoatAccessories;
import edu.jalc.coat.design.CoatDesign;
import edu.jalc.coat.hat.CoatHat;
import edu.jalc.coat.zipper.CoatZipper;
import java.awt.Color.*;
public class  WinterCoatBuilder implements WinterCoatBuilderInterface{

   double largeHatRadius,
          smallHatRadius,
          largeZipperLength,
          shortZipperLength;
   RGBColor oliveGreen,azureBlue;
   boolean isHatIncluded;
   
   RGBColor rgbColor;
   CoatAccessories accessories;
   CoatHat coatHat;
   CoatZipper coatZipper;
   CoatDesign design;
   
   public static WinterCoatBuilder newBuilder(){
      return new WinterCoatBuilder();
   }
   public  WinterCoatBuilderInterface withoutHat(boolean isHatIncluded){
      this.isHatIncluded=isHatIncluded;
      
      if ( isHatIncluded == false){
         coatHat=coatHat.notIncluded();
      }
      else
         coatHat=coatHat.included();
          
      return this;
   }
   
   public WinterCoatBuilderInterface  withLargeHat(double largeHatRadius){
      this.largeHatRadius=largeHatRadius;
      coatHat= new CoatHat(largeHatRadius);
      return this;
   }
   public  WinterCoatBuilderInterface withSmallHat(double smallHatRadius){
      this.smallHatRadius=smallHatRadius;
      coatHat= new CoatHat(smallHatRadius);
      return this;
   }
   public WinterCoatBuilderInterface withLargeZipper(double largeZipperLength){
      this.largeZipperLength= largeZipperLength;
      coatZipper=new CoatZipper( largeZipperLength);
      return this;
   }
   public WinterCoatBuilderInterface withSmallZipper(double shortZipperLength){
      this.shortZipperLength=shortZipperLength;
      coatZipper=new CoatZipper(shortZipperLength);
      return this;
   }
    
   public WinterCoatBuilderInterface oliveGreenColoredCoat(RGBColor oliveGreen){
      this.oliveGreen=oliveGreen;
      rgbColor=oliveGreen;
      return this;
   }
   
   public WinterCoatBuilderInterface azureColoredCoat(RGBColor azureBlue){
      this.azureBlue=azureBlue;
      rgbColor=azureBlue;
      return this;
   }
  
   public Coat build() throws Exception{
   
      if(this.isHatIncluded == true){
         if (this.largeHatRadius== 0.0 && this.smallHatRadius== 0.0){
            throw new Exception("Must have a hat radius");
         }
      }
   
      if(this.shortZipperLength == 0.0 && this.largeZipperLength==0.0){
         throw new Exception("You have to pick either a short or a large zipper length");
      }
      if (this.azureBlue==null && this.oliveGreen==null){
         throw new Exception("Your coat needs a color!!");
      }
      accessories=new CoatAccessories(coatHat,coatZipper);
      design=new  CoatDesign(rgbColor,null);
      return new Coat(accessories, design);
   }

   
}