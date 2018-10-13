package com.capgemini.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.capgemini.demo.bean.User;
@Mapper
public interface UserMapper {

	public Integer FindUserByIdentity(String identity);
	public User FindUserByName(String identity);
	public int CountUser();
	public void AddUser(User user);
	public void addUserAnswer(@Param("uaid")int useranswerid, @Param("userid")int userid, @Param("answerid")int selectanswerid,@Param("questionid") int questionid);
    
	public List<User> FindAllUser();
}
