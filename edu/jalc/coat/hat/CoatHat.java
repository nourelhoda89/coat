package edu.jalc.coat.hat;

import edu.jalc.coat.Parachutable;

public class CoatHat implements Glowable,Parachutable{

   private boolean withHat;
   private final double radius;

   private CoatHat(){
      this.withHat = false;
      this.radius = 0;
   }

   public CoatHat( double radius){
   
      this.radius = radius;
      this.withHat = false;
   }

   public double getRadius(){ 
      return this.radius; }
   public boolean isWithHat(){ 
      return this.withHat; }

   public CoatHat included(){
      this.setWithHat(true);
      return this;
   }

   public CoatHat notIncluded(){
      this.setWithHat(false);
      return this;
   }

   private void setWithHat(boolean withHat){
      this.withHat = withHat;
   }
   public void glow(){
      System.out.println("Awsome!Glowing coat");
   }
   public void deploy(){
      System.out.println("Parachutable Hat :)");
   }


}
