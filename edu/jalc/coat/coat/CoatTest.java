package edu.jalc.coat.coat;

import edu.jalc.coat.design.CoatDesign;
import edu.jalc.coat.accessories.CoatAccessories;
 
public class CoatTest{

   public void testGetAccessories() throws Exception {
      System.out.println("Testing Coat::getAccessories");
      CoatAccessories coatAccessories = new CoatAccessories(null,null);
      Coat coat = new Coat(coatAccessories, null);
      assert(coatAccessories == coat.getAccessories());
   }
   public void testGetDesign() throws Exception {
      System.out.println("Testing Coat::getDesign");
      CoatDesign coatDesign = new CoatDesign(null,null);
      Coat coat = new Coat( null, coatDesign);
      assert(coatDesign == coat.getDesign());
   }
   public static void main(String... args) throws Exception {
      CoatTest coatTest = new CoatTest();
      coatTest.testGetAccessories();
      coatTest.testGetDesign();
      System.out.println("All Coat Tests passed");
   }
}




