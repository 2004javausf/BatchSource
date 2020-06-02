package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Student;
import com.revature.dao.StudentDAO;
import com.revature.util.ConnFactory;

public class StudentDAOImpl implements StudentDAO{
public static ConnFactory cf= ConnFactory.getInstance();
	@Override
	public void insertStudent(int id, String name, int sch_id) throws SQLException {
		Connection conn= cf.getConnection();
		Statement stmt= conn.createStatement();
		String sql= "INSERT INTO STUDENT VALUES("+id+",'"+name+"',"+sch_id+")";
		stmt.executeUpdate(sql);
	}
	@Override
	public List<Student> getStudentList() throws SQLException {
		List<Student> studentList= new ArrayList<Student>();
		Connection conn=cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM STUDENT");
		Student s=null;
		while(rs.next()) {
			s= new Student(rs.getInt(1),rs.getString(2),rs.getInt(3));
			studentList.add(s);
		}
		return studentList;
	}

}
