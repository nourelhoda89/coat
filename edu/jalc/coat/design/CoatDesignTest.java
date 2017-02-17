package edu.jalc.coat.design;

import edu.jalc.coat.color.RGBColor;
import edu.jalc.coat.type.ParkaType;

public class CoatDesignTest {

	public void testGetRGBColor(){
		System.out.println("Testing CoatDesign :: getRGBColor");
		RGBColor rgbColor = new RGBColor((byte)1,(byte)1,(byte)1);
		CoatDesign coatDesign = new CoatDesign(rgbColor, null);
		assert(coatDesign.getRgbColor() == rgbColor);
	}

	public void testGetParkaType(){
		System.out.println("Testing CoatDesignTest :: getParkaType");
		ParkaType parkaType = new ParkaType("small");
		CoatDesign coatDesign = new CoatDesign(null, parkaType);
		assert(coatDesign.getParkaType() == parkaType);
	}


	public static void main(String... args){
		CoatDesignTest coatDesignTest = new CoatDesignTest();
		coatDesignTest.testGetRGBColor();
		coatDesignTest.testGetParkaType();
		System.out.println("CoatDesignTest completed");
	}
}