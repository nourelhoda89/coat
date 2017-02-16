public class CoatHat {

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

	public double getRadius(){ return this.radius; }
	public boolean isItWithHat(){ return this.withHat; }

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

}
