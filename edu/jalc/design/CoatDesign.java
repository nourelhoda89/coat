package edu.jalc.design;


import edu.jalc.color.RGBColor;
import edu.jalc.type.ParkaType;

public class CoatDesign {

	private final RGBColor rgbColor;
	private final ParkaType parkaType;

	public CoatDesign(){
	
		this.rgbColor = null;
		this.parkaType = null;
	}

	public CoatDesign(ParkaType parkaType){
		this.rgbColor = rgbColor;
		this.parkaType= parkaType;
	}

	public RGBColor getRgbColor() {
		return rgbColor;
	}
