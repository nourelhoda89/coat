package edu.jalc.coat.accessories;


import edu.jalc.coat.hat.CoatHat;
import edu.jalc.coat.zipper.CoatZipper;

public class CoatAccessoriesTest{

public void testSetCoatHat() throws Exception {
		System.out.println("Testing  CoatAccessories :: setCoatHat");
      
		CoatHat coatHat = new CoatHat(5);
      CoatAccessories coatAccessories = new CoatAccessories(coatHat,null);
		coatAccessories.setCoatHat(coatHat);
      assert (coatHat == coatAccessories.getCoatHat());
	}
   public void testSetCoatZipper() throws Exception {
		System.out.println("Testing  CoatAccessories :: setCoatZipper");
      
		CoatZipper coatZipper = new CoatZipper(5);
      CoatAccessories coatAccessories = new CoatAccessories(null,coatZipper);
		coatAccessories.setCoatZipper(coatZipper);
      assert (coatZipper == coatAccessories.getCoatZipper());
	}
   public void testSetCoatHatWithException() throws Exception {
		System.out.println("Testing  CoatAccessories :: setCoatHat for exception");
		boolean exceptionThrown = false;
		try {
			new CoatAccessories( null, null);
		} catch (Exception e){
			exceptionThrown = true;
		}

		assert(exceptionThrown);
	}
   
public  void main(String... args) throws Exception {
		 CoatAccessoriesTest  coatAccessoriesTest = new  CoatAccessoriesTest();
		 CoatAccessoriesTest.testSetCoatHat();
       
		 CoatAccessoriesTest.testSetCoatZipper();
		 CoatAccessoriesTest.testSetCoatHatWithException();
        //CoatAccessoriesTest.testSetCoatZipperWithException();
		
		System.out.println("All CoatAccessories Tests passed");
   



}
}