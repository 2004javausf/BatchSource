package com.revature.constructor;

public class ConstructorDemo extends D{
	
	/*Constructors
	 * how er instantiate an object
	 * No return type but does return that object that it created
	 * 
	 */
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.out.println("In Main");
		D d=new D();
		C c=new C();
		
	}

}

class A{
	
	static {System.out.println("A's static code block");}
	{System.out.println("A's instance code block");}
	
	A(){
		//B b= new B(); This breaks things
		System.out.println("Inside A's Constructor");
	}
}

class B extends A{
	B(){
		System.out.println("Inside B's Constructor");
	}
}

class C extends B{
	static {System.out.println("C's static code block");}
	C(){
		System.out.println("Inside C's Constructor");
	}
}

class D{
	static {System.out.println("D's static code block");}
	D(){
		System.out.println("Inside D's Constructor");
	}
}
