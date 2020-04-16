package com.revature.constructor;

public class ConstructorDemo extends D{

	/*Constructors
	 * how we instantiate an object
	 * No return type but does return that object that it created
	 * 
	 */
	
	public static void main(String[] args) {
		C c=new C();

	}

}

class A{
	A(){
		//B b= new B(); This breaks things
		System.out.println("Inside A's Constructor");
	}
}

class C extends B{
	C(){
		System.out.println("Inside C's Constructor");
	}
}
class B extends A{
	B(){

		System.out.println("Inside B's Constructor");
	}
}

class D {
	D(){
		System.out.println("Inside D's constructor");
	}
}
