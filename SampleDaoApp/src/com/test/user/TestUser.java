package com.test.user;

import com.elegant.user.dao.UserDao;
import com.elegant.user.impl.UserDaoImpl;
import com.elegant.user.model.UserModel;

public class TestUser {
	public static void main(String[] args) {
		UserDao dao = new UserDaoImpl();
		UserModel model = dao.getUserDeatails("pallabi@gmail.com");

		System.out.println(model.getFirstName());
		System.out.println(model.getLastName());
		System.out.println(model.getPassword());
		System.out.println(model.getAddress());

	}

}
