package com.capgemini.demo.service;

import com.capgemini.demo.bean.User;

public interface UserService {

	boolean checkIdentity(String identity);

	void addUser(String identity);

	User FindUserId(String thisname);

}
