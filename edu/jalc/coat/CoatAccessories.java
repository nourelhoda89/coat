package edu.jalc.parkaCoat.accessories;


import edu.jalc.parkaCoat.hat.CoatHat;
import edu.jalc.parkaCoat.zipper.CoatZipper;

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