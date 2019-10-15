package com.elegant.user.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.elegant.user.dao.StudentDao;
import com.elegant.user.model.StudentDto;

public class StudentDaoImpl implements StudentDao {

	public void saveStudent(StudentDto dto) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String userName = "system";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, userName, password);
			String query = "insert into student values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, dto.getRollNum());
			pst.setString(2, dto.getName());
			pst.setInt(3, dto.getMarks());
			pst.setString(4, dto.getAddress());
			int rows = pst.executeUpdate();
			pst.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public StudentDto getStudentDetails() {
		return null;
	}

}
