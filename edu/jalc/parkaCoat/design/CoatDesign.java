package edu.jalc.parkaCoat.design;


import edu.jalc.parkaCoat.color.RGBColor;
import edu.jalc.parkaCoat.type.ParkaType;

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

	public RGBColor getRgbColor() {
		return rgbColor;
	}
   public ParkaType getParkaType (){
   return parkaType;
   }
   }
