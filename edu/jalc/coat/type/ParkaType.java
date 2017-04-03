package edu.jalc.coat.type;

import edu.jalc.coat.Parachutable;


public class ParkaType implements Heatable,Parachutable {
   private final String size;

   private ParkaType(){
      this.size = null;
   }

   public ParkaType(String size){
      this.size = size;
   }

   public String getSize(){
      return this.size;
   }
   public void heat(){
      System.out.println("Heating for extra warmth");
   }
   public void deploy(){
      System.out.println("WOW! parachutable Coat ");
   }

}

