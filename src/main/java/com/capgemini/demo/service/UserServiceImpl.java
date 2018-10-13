package com.capgemini.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.demo.bean.User;
import com.capgemini.demo.mapper.UserMapper;

@Repository("UserService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper usermapper;

	@Override
	public boolean checkIdentity(String identity) {
	  if(identity==""||identity==null){return false;}
		
		if(usermapper.FindUserByIdentity(identity)!=null){return false;}
		return true;
	}

	@Override
	public void addUser(String identity) {
       int id=usermapper.CountUser()+1;	
       User user=new User();
       user.setId(id);
       user.setIdentity(identity);
       usermapper.AddUser(user);
	}

	@Override
	public User FindUserId(String thisname) {
       User user=usermapper.FindUserByName(thisname);
       
       System.out.println("身份证："+thisname+"userid:"+user.getId());
		return user;
	}

}
