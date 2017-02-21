package edu.jalc.coat.hat;

public class CoatHatTest {

   public void testGetRadius(){
      System.out.println("Testing CoatHat::getRadius");
      CoatHat hat = new CoatHat(7.5);
      assert(7.5 == hat.getRadius());
   }

   public void testIncluded(){
      System.out.println("Testing CoatHat::included");
      CoatHat hat = new CoatHat(4);
      hat.included();
      assert(hat.isWithHat());
   }

   public void testNotIncluded(){
      System.out.println("Testing CoatHat::notIncluded");
      CoatHat hat = new CoatHat(4);
      hat.notIncluded();
      assert(!hat.isWithHat());	
   }

   public static void main(String... args) throws Exception {
      CoatHatTest test = new CoatHatTest();
   	
      test.testGetRadius();
      test.testIncluded();
      test.testNotIncluded();
   
      System.out.println("All CoatHat Tests passed");
   }
}