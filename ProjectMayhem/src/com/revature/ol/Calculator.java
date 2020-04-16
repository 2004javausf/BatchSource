package com.revature.ol;

public class Calculator {
	
	static int a;
	static double b;
	
	public static void main(String[] args) {
		a=5;
		b=a;	
		b=3.9;
		a=(int)b;
		System.out.println(a);
		System.out.println(b);
		add(add(5,4),6);
		add(1.3, 4.5);
		add(4,5,6);
	}
	//Parametric polymorhism
	static int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}

	static double add(double a, double b) {
		System.out.println(a+b);
		return a+b;
	}
	static void add(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
}
