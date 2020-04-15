package com.revature.driver;
import com.revature.beans.Human;
public class Driver {
	public static void main(String[] args) {
		
		Human h= new Human();
		h.setName("Ahmad");
		h.setAge(22);
		h.setWeight(150);
		System.out.println(h.getName());
		System.out.println(h.getAge());
		System.out.println(h.getWeight());
	}
}
