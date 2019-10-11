package com.elegant.user.dao;

import com.elegant.user.model.UserModel;

public interface UserDao {

	public void saveUser(UserModel userModel);

	public UserModel getUserDeatails(String email);

}
