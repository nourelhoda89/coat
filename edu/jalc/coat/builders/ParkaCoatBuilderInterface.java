package edu.jalc.coat.builders;

import edu.jalc.coat.coat.Coat;
//import java.awt.Color;
import edu.jalc.coat.color.RGBColor;

public interface ParkaCoatBuilderInterface{  
  
   ParkaCoatBuilderInterface withoutHat();
   ParkaCoatBuilderInterface withHat();
   ParkaCoatBuilderInterface hasLargeHat();
   ParkaCoatBuilderInterface hasSmallHat();
   ParkaCoatBuilderInterface hasLongZipper();
   ParkaCoatBuilderInterface hasShortZipper(); 
   ParkaCoatBuilderInterface inOliveGreenColor();
   ParkaCoatBuilderInterface inAzureColor(); 
   public Coat build()throws Exception ;
}