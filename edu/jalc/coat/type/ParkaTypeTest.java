package edu.jalc.coat.type;

public class ParkaTypeTest {

   public void testGetSize(){
   
      System.out.println("Testing ParkaType :: getSize");
      ParkaType parkaType = new ParkaType("medium");
      assert( "medium" == parkaType.getSize());
   }
   
   public static void main(String... args) throws Exception {
      ParkaTypeTest test = new  ParkaTypeTest();
   	
      test.testGetSize();
      System.out.println("All ParkaType Tests passed");
   }

}