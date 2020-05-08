package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.PowersDAOImpl;
import com.revature.daoimpl.StudentDAOImpl;
import com.revature.daoimpl.SuperHeroDAOImpl;

public class Driver {
	
	
	public static void main(String[] args) {
		StudentDAOImpl sdi= new StudentDAOImpl();
		PowersDAOImpl pdi = new PowersDAOImpl();
		SuperHeroDAOImpl shdi= new SuperHeroDAOImpl();
		try {
			//sdi.insertStudent(1,"Matt",34);
			//System.out.println(sdi.getStudentList());
			//pdi.createPowers("Flight");
			shdi.createSuperHero("Groot");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
