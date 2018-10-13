package com.capgemini.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.capgemini.demo.bean.Answer;

@Mapper
public interface AnswerMapper {
         
	public List<Answer> FindAnswerByQuestionId(int id);
	public Answer FindAnswerByAnswerId(int id);
/*    public int FindQuestionIdByanswerid(int id);*/
	public Answer FindTrueAnswerByQuestionId(int id);
	}
