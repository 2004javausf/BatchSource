package com.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
	
	// Ordered list of objects related to insertion order
	
	//Follows the First-in-First-Out (FIFO) principle.
	
	//Methods:
	//		poll,remove, peek and element
	
	//Other principle is: First - in - Last - Out (FILO , LIFO) 
	// Stack

	public static void main(String[] args) {

		Queue<String> myFirstQueue = new LinkedList<>();
		Queue<String> myOtherQ = new PriorityQueue<>();
		Queue<String> myOtherOther = new ArrayDeque<>();
		
		myFirstQueue.add("Peter Pan");
		myFirstQueue.add("Marmaduke");
		myFirstQueue.add("Spawn");
		
		myOtherQ.addAll(myFirstQueue);
		
		System.out.println(myFirstQueue);
		
//		System.out.println(myFirstQueue.poll()); //poll, returns you the value at the head of the queue and removes it
//		System.out.println(myFirstQueue);		// returns null if empty
//		System.out.println(myFirstQueue.poll());
//		System.out.println(myFirstQueue);
//		System.out.println(myFirstQueue.poll());
//		System.out.println(myFirstQueue);
//		System.out.println(myFirstQueue.poll());
//		System.out.println(myFirstQueue);
//		
		
//		System.out.println(myFirstQueue.remove()); //remove, also returns the value at the head of the queue and removes it
//		System.out.println(myFirstQueue);			// but will throw an exception if empty
//		System.out.println(myFirstQueue.remove());
//		System.out.println(myFirstQueue);
//		System.out.println(myFirstQueue.remove());
//		System.out.println(myFirstQueue);
//		System.out.println(myFirstQueue.remove());
		
//		System.out.println(myFirstQueue.peek()); //Allows you to see the head element, and return null
//		System.out.println(myFirstQueue);
//		
//		System.out.println(myFirstQueue.element());
		
//		System.out.println(myOtherQ);
//		
//		myFirstQueue.add(null);
//		System.out.println(myFirstQueue);
//		myOtherQ.add(null); //
		
		for(String i: myFirstQueue) {
			System.out.println(i);
		}
		
	}

}
