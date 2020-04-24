package com.revature.classtypes;

public class Shark extends Fish implements Hunt{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("I'm swimming underwater and im terrifying.");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("I breath underwater, meeeeegh");
		
	}
	
	@Override
	public void findPrey() {
		System.out.println("I hate fishes.");
	}

}
