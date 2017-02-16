package edu.jalc.coat.accessories;


import edu.jalc.coat.hat.CoatHat;
import edu.jalc.coat.zipper.CoatZipper;

public class CoatAccessories{

	private final CoatHat coatHat;
	private final CoatZipper coatZipper;

	private CoatAccessories(){
		this.coatHat = null;
		this.coatZipper = null;
	}

	public CoatAccessories(CoatHat coatHat,CoatZipper coatZipper){
		this.coatHat = coatHat;
		this.coatZipper=coatZipper;
	}


	public CoatHat getCoatHat() {
		return coatHat;
	}
   
	public CoatZipper getCoatZipper() {
		return coatZipper;
	}

}