package edu.jalc.coat.coat;

import edu.jalc.coat.design.CoatDesign;
import edu.jalc.coat.accessories.CoatAccessories;
 
public class Coat implements Inflatable,SelfWashable{

   private  CoatAccessories accessories;
   private  CoatDesign design;
 
   private Coat() throws Exception {
      this.accessories =null;
      this.design =null;
   }
   
   public Coat( CoatAccessories accessories,CoatDesign design)throws Exception {
      this.accessories= accessories;
      this.design =design;
   }
   
   public CoatAccessories getAccessories (){	
      return this.accessories; }
      
   public CoatDesign getDesign(){
      return this.design;}
 
 
   public Coat setAccessories (CoatAccessories accessories)throws Exception {
      if (accessories ==null ){throw new Exception ("CoatAccessories cannot be null");}
      this.accessories = accessories;
      return this;
   }
   
   public Coat setDesign (CoatDesign design)throws Exception {
      if (design == null ){throw new Exception ("CoatDesign cannot be null");}
      this.design = design;
      return this;
   }
   public void inflate(){
   System.out.println("Beware your coat is inflating!!");
   }
   public void selfWash(){
   System.out.println("The coat is self washing");
   }

}
