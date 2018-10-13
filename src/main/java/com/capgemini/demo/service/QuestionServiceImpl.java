package com.capgemini.demo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.demo.bean.Answer;
import com.capgemini.demo.bean.Question;
import com.capgemini.demo.mapper.QuestionMapper;

@Repository("QuestionService")
public class QuestionServiceImpl implements QuestionService{
	@Autowired
	private QuestionMapper questionMapper;

	@Override
	public Question addQuestion(int questionid) {
		Question question=questionMapper.FindQuestionById(questionid);
		List<Answer> answerlist=question.getAnswers();
		Collections.shuffle(answerlist);
		question.setAnswers(answerlist);
		return question;
          		
	}
}
