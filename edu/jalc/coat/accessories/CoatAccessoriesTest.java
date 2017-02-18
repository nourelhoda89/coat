package edu.jalc.coat.accessories;


import edu.jalc.coat.hat.CoatHat;
import edu.jalc.coat.zipper.CoatZipper;

public class CoatAccessoriesTest{

   public void testSetCoatHat() throws Exception {
      System.out.println("Testing  CoatAccessories :: setCoatHat");
      CoatAccessories coatAccessories = new CoatAccessories(null,null);
      CoatHat coatHat = new CoatHat(5);
      coatAccessories.setCoatHat(coatHat);
      assert (coatHat == coatAccessories.getCoatHat());
   }
   
   public void testSetCoatZipper() throws Exception {
      System.out.println("Testing  CoatAccessories :: setCoatZipper");
      CoatAccessories coatAccessories = new CoatAccessories(null,null);
      CoatZipper coatZipper = new CoatZipper(5);
      coatAccessories.setCoatZipper(coatZipper);
      assert (coatZipper == coatAccessories.getCoatZipper());
   }
        
   public  static void main(String... args) throws Exception {
      CoatAccessoriesTest  coatAccessoriesTest = new  CoatAccessoriesTest();
      coatAccessoriesTest.testSetCoatHat();
      coatAccessoriesTest.testSetCoatZipper();
      System.out.println("All CoatAccessories Tests passed");
   
   
   
   
   }
}