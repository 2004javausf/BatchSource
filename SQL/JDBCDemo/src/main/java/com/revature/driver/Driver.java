package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.StudentDAOImpl;

public class Driver {
	
	
	public static void main(String[] args) {
		StudentDAOImpl sdi= new StudentDAOImpl();
		try {
			//sdi.insertStudent(1,"Matt",34);
			System.out.println(sdi.getStudentList());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
