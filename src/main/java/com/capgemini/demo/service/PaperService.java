package com.capgemini.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.demo.bean.Question;

public interface PaperService {

	void addPaper(int grade, int userid);

	void addPaperQuestion(List<Question> thisquestionlist);

	void addUserAnswer(List<Question> thisquestionlist, ArrayList<Object> answerid, int userid);

}
