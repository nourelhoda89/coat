package edu.jalc.coat.accessories;


import edu.jalc.coat.hat.CoatHat;
import edu.jalc.coat.zipper.CoatZipper;

public class CoatAccessories{

   private  CoatHat coatHat ;
   private  CoatZipper coatZipper;

   private CoatAccessories()throws Exception{
      this.setCoatZipper(null);
      this.setCoatHat(null);
   }

   public CoatAccessories(CoatHat coatHat,CoatZipper coatZipper)throws Exception{
      this.setCoatHat(coatHat);
      this.setCoatZipper(coatZipper);
   }

   public CoatHat getCoatHat() {
      return this.coatHat;}
   
   public CoatZipper getCoatZipper() {
      return this.coatZipper;}
   
  
   public CoatAccessories setCoatHat(CoatHat coatHat){
      this.coatHat = coatHat;
      return this;
   }
   public CoatAccessories setCoatZipper(CoatZipper coatZipper) {
      this.coatZipper = coatZipper;
      return this;
   }

}