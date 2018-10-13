package com.capgemini.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.capgemini.demo.bean.Question;

@Mapper
public interface QuestionMapper {
   
	public Question FindQuestionById(int id);
	public Question FindTrueQuestionById(int id);
}
