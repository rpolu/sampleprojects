package com.elegant.user.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;

import com.elegant.user.dao.StudentDao;
import com.elegant.user.model.StudentDto;

public class SydentDaoImpl implements StudentDao {

	public void saveStudent(StudentDto dto) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String userName = "system";
			String password = "tiger";
			Connection con=DriverManager.getConnection(url, userName, password);
			
			String query="insert into users values(?,?,?,?,?)";
			
			
					con.prepareStatement(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public StudentDto getStudentDetails() {
		return null;
	}

}
