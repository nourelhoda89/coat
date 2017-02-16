package edu.jalc.zipper;
public class CoatZipper {

	private boolean withZipper;
	private final double lenght;

	private CoatZipper(){
		this.withZipper = false;
	   this.lenght = 0;
	}

	public CoatZipper( double lenght){

		this.lenght = lenght;
		this.withZipper = false;
	}

	public double getLenght(){ return this.lenght; }
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
		this.withZipper = withZipper;}

}
