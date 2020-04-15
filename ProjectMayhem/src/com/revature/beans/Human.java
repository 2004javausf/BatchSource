package com.revature.beans;
//Packages are just very fancy folders. Namespace


/*
 * Naming Conventions
 * Classes and Projects: Pascal casing, Capitalize the first letter of each word ex. ProjectMayhem
 * Methods and variables: Camel casing,  ex. firstSecondThird
 * packages: lowercase and delimited by periods
 * Constants: ALL_CAPS_LOLZ typically delimited by underscores
 */

public class Human {
	/*
	 * Members of a class- couple of forms
	 * Instance variables-property of a specific object (human's name)
	 * Static variables - property of the class shared by all of it's instances
	 * Instance methods -behavior relative to a specific object
	 * Static methods- behavior relative to entire class
	 * constructor- instantiates the class using the keyword "new"
	 *
	 */
	private String name;
	private int age;
	private int weight;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
}
