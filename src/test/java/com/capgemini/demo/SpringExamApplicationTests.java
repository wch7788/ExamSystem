package com.capgemini.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.demo.bean.User;
import com.capgemini.demo.mapper.AnswerMapper;
import com.capgemini.demo.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringExamApplicationTests {
  @Autowired
  UserMapper usermapper;
  @Autowired
  AnswerMapper answermapper;
	 
	@Test
	public void contextLoads() {
		this.test();
	}

	public void test(){
		System.out.println(usermapper.FindAllUser().get(10).getPaper().getPaperquestions().get(0).getQuestionid());
		
	}
	
}
