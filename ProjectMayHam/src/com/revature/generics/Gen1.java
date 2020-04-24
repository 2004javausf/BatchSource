package com.revature.generics;
/*Generics
 * using a type as a parameter
 * write code that can handle diff types of objects
 * use angle bracket <> to denote that something is a generic
 * Allows us to ensure type safety
 * adds stability and reusability to our code
 * Placeholder (T,E,?,etc.)
 */



public class Gen1<T> {
	//declare an object of type T
	T ob;
	
	//pass the constructor a reference to an object of type T
	Gen1(T o){
		ob = o ;
	}
	//return on
	T getOb() {
		return ob;
	
	}
	
	//show the type of T
	void showType() {
		System.out.println("Type of T is: "+ ob.getClass().getName());
	}

}
