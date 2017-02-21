package edu.jalc.coat.zipper;

public class CoatZipperTest {

   public void testGetLength(){
      System.out.println("Testing CoatZipper :: getLength");
      CoatZipper zipper = new CoatZipper(45);
      assert(45 == zipper.getLength());
   }

   public void testIncluded(){
      System.out.println("Testing CoatZipper :: included");
      CoatZipper zipper = new CoatZipper(30);
      zipper.included();
      assert(zipper.isWithZipper());
   }

   public void testNotIncluded(){
      System.out.println("Testing CoatZipper :: notIncluded");
      CoatZipper zipper = new CoatZipper(30);
      zipper.notIncluded();
      assert(!zipper.isWithZipper());	}

   public static void main(String... args) throws Exception {
      CoatZipperTest test = new CoatZipperTest();
   	
      test.testGetLength();
      test.testIncluded();
      test.testNotIncluded();
   
      System.out.println("All CoatZipper Tests passed");
   }
}