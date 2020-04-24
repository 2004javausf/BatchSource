package com.revature.io;

import com.revature.beans.Human;

public class SerialDemo {
	public static void main(String[] args) {
		/*
		 * IO io = new IO();
		 * 
		 * String a = "banana"; io.writeOutputStreamContents("Lady gaga "+ a);
		 */
		/*
		 * try { io.writeOutputStreamContents("Lady gaga " + a); } catch (Exception e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		/* System.out.println(io.readInputStreamContents()); */
		Human h1 = new Human("Matt", 88,9);
		Human h2 = new Human("JP", 88,9);
		Human h3 = new Human("Tina", 88,9);
		IOWithCollections.humanList.add(h1);
		IOWithCollections.humanList.add(h2);
		IOWithCollections.humanList.add(h3);
		
		IOWithCollections.writenHumanFile();
		IOWithCollections.readHumanFile();
		System.out.println(IOWithCollections.humanList.toString());
	}

}
