package com.revature.classtypes;
/*special type of class that can't be instantiated
 * specify what a class must do but not how it does it!
 * lack instance variables
 * characterized by behavior
 * can mimic multiple inheritance w/ interfaces
 * class can implements interface 0+;
 * interfaces can extend other interface 0+
 * All variable are implicitly static, public, and final (java 8)
 */

public interface Hunt {
	
	public abstract void findPrey();
	

}
