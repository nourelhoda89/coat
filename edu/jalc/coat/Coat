package edu.jalc.coat;

 import edu.jalc.design.CoatDesign;
 import edu.jalc.accessories.CoatAccessories;
 
 public class Coat{
 private CoatAccessories accessories;
 private final CoatDesign design;
 
 private Coat() throws Exception {
 this.accessories=null;
 this.design =null;
 }
 coat( CoatAccessories accessories,CoatDesign design)throws Exception {
  this.accessories=accessories;
 this.design =design;
 }
 CoatAccessories getAccessories(){return this.accessories;}
 CoatDesign getDesign(){return this.design;}
 
 Coat setAccessories (CoatAccessories accessories)throws Exception {
 if (accessories ==null ){throw mew Exception ("CoatAccessories cannot be null");}
  this.accessories=accessories;
 return this;
 }
 
