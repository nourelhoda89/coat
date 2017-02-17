package edu.jalc.coat.accessories;


import edu.jalc.coat.hat.CoatHat;
import edu.jalc.coat.zipper.CoatZipper;

public class CoatAccessories{

   private  CoatHat coatHat;
   private  CoatZipper coatZipper;

   private CoatAccessories(){
      this.coatHat = null;
      this.coatZipper = null;
   }

   public CoatAccessories(CoatHat coatHat,CoatZipper coatZipper){
      this.coatHat = coatHat;
      this.coatZipper=coatZipper;
   }

   public CoatHat getCoatHat() {
      return coatHat;}
   
   public CoatZipper getCoatZipper() {
      return coatZipper;}
   
   public CoatAccessories setCoatHat(CoatHat coatHat) throws Exception {
      if(coatHat == null) throw new Exception("CoatHat cannot be null");
      this.coatHat = coatHat;
      return this;
   }
   
   public CoatAccessories setCoatZipper(CoatZipper coatZipper) throws Exception {
      if(coatZipper == null) throw new Exception("CoatZipper cannot be null");
      this.coatZipper= coatZipper;
      return this;
   }

}