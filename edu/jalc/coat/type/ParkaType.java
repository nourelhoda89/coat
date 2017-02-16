package edu.jalc.coat.type;

public class ParkaType {
	private final String size;

	private ParkaType(){
		this.size = null;
	}

	public ParkaType(String size){
		this.size = size;
	}

	public String getsize(){
		return this.size;
	}
}

