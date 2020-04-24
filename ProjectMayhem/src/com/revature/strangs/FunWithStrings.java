package com.revature.strangs;

public class FunWithStrings {
	/*Strings!
	 * not Char or Character
	 * Fully Qualified class name: java.lang.String
	 * String literal is 0+ characters ex "" or String a = "Roll Tide";
	 * concatenate Strings w/ + or.concat("something")
	 * "goodbye" + "earth"
	 * 
	 * Strings are immutable
	 * String pull - collection of unique String literals in heap memory
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		 String a = "Roll"; //this creates a new reference in the string pool
		 System.out.println(a.hashCode());
		 a = a.concat(" Tide");//this ALSO creates a new reference in the string pool
		 System.out.println(a);
		 System.out.println(a.hashCode());
		 String b = "Roll";
		 System.out.println(b.hashCode());
		 String c = "Roll";//compiler is search string poll to see if this exists already
		 System.out.println(c.hashCode());
		 String d = new String("Roll");
		 System.out.println(d.hashCode());
		 System.out.println(c.charAt(1));
		 
			/*String - String pool! Immutable, thread safe (synchronized),fast
			 * StringBuilder- no String pool, Mutable, not thread safe,fast
			 * StringBuffer- no String pool, Mutable, thread safe,slow
			 */
			
		StringBuilder sb = new StringBuilder("Hey");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		StringBuffer t = new StringBuffer("Woo");
		System.out.println(t);
		System.out.println(t.hashCode());
		 
	}
	


}
	
