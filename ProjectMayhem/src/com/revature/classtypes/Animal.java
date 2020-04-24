package com.revature.classtypes;

//What type of class we have? 
//concrete class, abstract class, Interface

/*Abstract class
 * special class that can't be instantiated, but they can be subclassed.
 * 
 * why abstract class
 * is used to provide common method implementation to all the subclasses or
 * to provide default implementation
 * 
 * they contain at lease 1 abstract method
 * can contain concrete methods
 * "contract based" - abstract method MUST be overriden in subclass
 * 
 */

public abstract class Animal {
	//abstract method
	public abstract void breathe();
	

}
