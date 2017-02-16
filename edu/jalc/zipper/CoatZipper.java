package edu.jalc.zipper;
public class CoatZipper {

	private boolean withZipper;
	private final double length;

	private CoatZipper(){
		this.withZipper = false;
	   this.length = 0;
	}

	public CoatZipper( double length){

		this.length = length;
		this.withZipper = false;
	}

	public double getLenght(){ return this.length; }
	public boolean isItWithZipper(){ return this.withZipper; }

	public CoatZipper included(){
		this.setWithZipper(true);
		return this;
	}

	public CoatZipper notIncluded(){
		this.setWithZipper(false);
		return this;
	}

	private void setWithZipper(boolean withZipper){
		this.withZipper = withZipper;
      }

}
