package com.capgemini.demo.bean;

import java.util.List;

public class Question {
	private int id;
	private String question;
	private List<Answer> answers;
	private Answer trueanswer;
	public Question(int id, String question) {
		super();
		this.id = id;
		this.question = question;
	}
	public Question() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public Answer getTrueanswer() {
		return trueanswer;
	}
	public void setTrueanswer(Answer trueanswer) {
		this.trueanswer = trueanswer;
	}
	
	
	

}
