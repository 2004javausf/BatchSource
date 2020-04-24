package com.revature.classtypes;

//import com.revature.beans.Human;
import com.revature.classtypes.Initiated;

public class Driver {
	
	public static void main(String[] args) {
		Shark shark = new Shark();
		shark.breathe();
		shark.findPrey();
		shark.swim();
		Initiated h = new Initiated ();
		h.findPrey();
	}

}
