package com.elegant.user.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.elegant.user.dao.UserDao;
import com.elegant.user.model.UserModel;

public class UserDaoImpl implements UserDao {

	public void saveUser(UserModel userModel) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String userName = "system";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, userName, password);
			String query = "insert into users values(?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, userModel.getFirstName());
			pst.setString(2, userModel.getLastName());
			pst.setString(3, userModel.getEmail());
			pst.setString(4, userModel.getPassword());
			pst.setString(5, userModel.getAddress());
			int result = pst.executeUpdate();
			pst.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UserModel getUserDeatails(String email) {
		UserModel userModel = new UserModel();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String userName = "system";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, userName, password);
			String query = "select *  from  users where email = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				userModel.setFirstName(rs.getString("FNAME"));
				userModel.setLastName(rs.getString("LASTNAME"));
				userModel.setPassword(rs.getString("PASSWORD"));
				userModel.setAddress(rs.getString("ADDRESS"));
			}
			rs.close();
			pst.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userModel;
	}

}
