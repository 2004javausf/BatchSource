package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {
	
	//List
	//	A list is indexed 
	//	Allows duplicates
	//	An ordered sequence 

	public static void main(String[] args) {

		List<String> myFirstList = new ArrayList<>();
		myFirstList.add("We're doing great!!!!");
		myFirstList.add("Here's another String!");
		myFirstList.add("Another one for the road");
		myFirstList.add("Here's another String!");
		
//		System.out.println(myFirstList);
//		
//		System.out.println(myFirstList.get(0));
//		myFirstList.set(1, "Here's my new String");
//		System.out.println(myFirstList);
		
		
		List<String> myOtherList = new LinkedList<>();
		myOtherList.addAll(myFirstList);
		
//		System.out.println(myOtherList.remove(0));
//		System.out.println(myOtherList);
//		
		
//		System.out.println(myFirstList.subList(2, 3));
		
		
		
		//Linked List is only good, if you're adding and removing a lot of elements 
		//Array List is more efficient overall. 
		
		/*
		 * Access via index (positional access): interact with the elements based on their position in the ArrayList
		 * 											get, set, add, addAll and remove 
		 */
		
		myOtherList.get(3);
		myOtherList.set(2, "Whatever I type");
		myOtherList.add("A string I'd like to add");
		myOtherList.addAll(myFirstList);
		myOtherList.remove(3);
		
		/*
		 * Search: find a specified object in the list and return its position:
		 * 	indexOf();
		 * 	lastIndexOf();
		 */
		
//		System.out.println(myOtherList.indexOf("whatever I type")); //If object doesn't exist, you'll get -1
		
		
		/*
		 * Range view methods:
		 * 			sublist()
		 */
		
		
		System.out.println(myOtherList.subList(2,2)); //(inclusive, exclusive) == (n, m-1)

	}

}
