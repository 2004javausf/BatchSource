package com.collection;




import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.random.RandomObject;

public class MySpecialSet {
	
	//Collection Framework 
	// List, Set, Queue All interfaces in the Collection 
	
	//Why?
	// Array object within Java is limited. Mainly that the array is immutable and you're given not 
	// many methods to work with. 
	// 
	
	/*
	 * Called a framework (more library), provides interfaces and classes that allow developers to more easily
	 * manage a group of objects. 
	 * 
	 * Advantages:
	 * 		Reduces effort (provides data structure and algorithms for you)
	 * 		Increase performance 
	 * 		Encourages software reuse 
	 * 
	 * BUT!
	 * 		convert primitive values into object
	 * 		ints -> Integer
	 * 		boolean -> Boolean
	 * 		byte -> Byte
	 * 
	 * 		The process of converting a primitive data types into its Wrapper class is called boxing
	 */
	
	/*
	 * What is a SET?????
	 * 		Does not allow duplicate objects
	 * 		Does not in general guarantee insertion order
	 * 		Sets are equal if they contain the same elements. 
	 * 
	 * HashSet: 
	 * 		Maintains no order, stores in hash table, best performance
	 * 
	 * LinkedHashSet:
	 * 		Maintains insertion order, weaker performance
	 * 
	 * TressSet 
	 * 		Maintains value order, very slow performance
	 */
	public static void main(String[] args) {
		
		Set<String> myFirstSet = new HashSet<String>();
		
		myFirstSet.add("Hello There");
		myFirstSet.add("What hapens do an empty string?");
		myFirstSet.add("");
//		System.out.println(myFirstSet.add("Peter Pan")); //returns a boolean if operation was successful
//		
//		System.out.println(myFirstSet.add("Peter Pan"));
//
//		System.out.println(myFirstSet);
		
		Set<String> myOtherSet = new HashSet<>();
		
//		myOtherSet.add("Spice Girls");
//		myOtherSet.add("Hello There");
//		
//		myOtherSet.addAll(myFirstSet);
//		
//		System.out.println(myOtherSet);
//		
//		myOtherSet = myFirstSet; //By reference, so other sets will change 
//		
//		myFirstSet.add("Apples"); 
//		
//		System.out.println(myOtherSet);
//		System.out.println(myFirstSet);
		
		Set<Object> randomSet = new HashSet<>();
		RandomObject rand1 = new RandomObject("Cameron");
		RandomObject rand2 = new RandomObject("Chad");
		
		randomSet.add(rand1);
		randomSet.add(rand2);
		
//		System.out.println(randomSet);
		
		
		//TreeSet:
		
		Set<Object> myFirstTreeSet = new TreeSet<>(); //Created a tree set, preserves value/sorting order
//		myFirstTreeSet.add(4);
//		myFirstTreeSet.add(2);
//		myFirstTreeSet.add(3);
//		myFirstTreeSet.add(57);
//		myFirstTreeSet.add(1);
////		myFirstTreeSet.add("Apples");
//		myFirstTreeSet.add(3.3);
		
//		System.out.println(myFirstTreeSet);
		
		Set<Object> myFinalSet = new HashSet<>(); //No comparisons are being done, so heterogeneous objects are allowed
		
		myFinalSet.add(42);
		myFinalSet.add("Good day");
		
		Object myObject = new Object(); //object tangent
		
//		System.out.println(myFinalSet);
		
		Set<Integer> myLinkedSet = new LinkedHashSet<>(); //Preserve insertion order 
		
		myLinkedSet.add(72);
		myLinkedSet.add(15);
		myLinkedSet.add(107);
		
		System.out.println(myLinkedSet);
		
		//Tree set will keep value order
		//Linked Hash Set will preserve insertion order 
		
		
		
	}

}
