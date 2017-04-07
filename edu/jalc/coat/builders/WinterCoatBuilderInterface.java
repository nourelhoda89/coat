package edu.jalc.coat.builders;

import edu.jalc.coat.coat.Coat;
//import java.awt.Color;
import edu.jalc.coat.color.RGBColor;

public interface WinterCoatBuilderInterface{  
  
   WinterCoatBuilderInterface withoutHat(boolean isHatIncluded);
   WinterCoatBuilderInterface withLargeHat(double largeHatRadius);
   WinterCoatBuilderInterface withSmallHat(double smallHatRadius);
   WinterCoatBuilderInterface withLargeZipper(double largeZipperLength);
   WinterCoatBuilderInterface withSmallZipper(double shortZipperLength); 
   WinterCoatBuilderInterface oliveGreenColoredCoat(RGBColor oliveGreen);
   WinterCoatBuilderInterface azureColoredCoat(RGBColor azureBlue); 
  /* public Coat build();*/
}