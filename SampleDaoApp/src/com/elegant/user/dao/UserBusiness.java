package com.elegant.user.dao;
import com.elegant.user.impl.UserDaoImpl;
import com.elegant.user.model.UserModel;
public class UserBusiness {
	public static void main(String[] args) {

		UserModel userModel = new UserModel();
		userModel.setFirstName("pallabi");
		userModel.setLastName("priya");
		userModel.setEmail("pallabi@gmail.com");
		userModel.setPassword("KKKKKKKK");
		userModel.setAddress("odisha");

		UserDao dao = new UserDaoImpl();
		dao.saveUser(userModel);
		
		
		System.out.println(" saved suceessfully");

	}

}
