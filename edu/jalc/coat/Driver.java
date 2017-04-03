package edu.jalc.coat;

import java.util.*;
import java.util.ArrayList;
import edu.jalc.coat.hat.CoatHat;
import edu.jalc.coat.type.ParkaType;
import edu.jalc.coat.coat.Coat;

public class Driver {
   public static void main(String... args)throws Exception {
   
   	//polymorphism
      ArrayList<Parachutable> ParachutableItems = new ArrayList<>();
      ParachutableItems.add(new CoatHat(4));
      ParachutableItems.add(new ParkaType("medium"));
   
      Iterator iterator = ParachutableItems.iterator();
      while(iterator.hasNext()){
         ((Parachutable)iterator.next()).deploy();
      }
      //trying new methods
      System.out.println("\n");
      Coat coat= new Coat(null,null);
      coat.selfWash();
      coat.inflate();
   }
}