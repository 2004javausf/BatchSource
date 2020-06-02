package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Student;

public interface StudentDAO {
/*DAO Design Pattern
 * Data Access Object
 * Modularity and Loose coupling
 * beanDAO(interface) and beanDAOImpl(concrete class)
 * want to make sure that the only thing interacting with the db is the DAOImpl
 * DAO is an open interface w/ multiple implementations
 */
	
	//DAO methods usually deal with CRUD ops!
	
	//Create
	public void insertStudent(int id,String name, int sch_id) throws SQLException;
	
	//Read all
	public List<Student> getStudentList() throws SQLException;
}
