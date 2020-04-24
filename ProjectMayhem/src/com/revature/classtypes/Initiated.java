package com.revature.classtypes;

public class Initiated implements Hunt{
	
	String name;

	public Initiated() {
		super();
		this.name = name;
	}


	@Override
	public void findPrey() {
		// TODO Auto-generated method stub
		System.out.println("I eat octopus.");
		
	}	
	
	@Override
	public String toString() {
		return "Initiated [name= " + name + "]";
	}


	
	


	
	


}
