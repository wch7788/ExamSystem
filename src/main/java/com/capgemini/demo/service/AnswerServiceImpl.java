package com.capgemini.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.demo.bean.Answer;
import com.capgemini.demo.mapper.AnswerMapper;

@Repository("AnswerService")
public class AnswerServiceImpl implements AnswerService{
	@Autowired
	private AnswerMapper answerMapper;

	@Override
	public boolean checkAnswer(int checkedanswerid) {
     
		Answer answer=answerMapper.FindAnswerByAnswerId(checkedanswerid);
		if(answer.getIstrue()==1){return true;}
		return false;
	}
	

}
