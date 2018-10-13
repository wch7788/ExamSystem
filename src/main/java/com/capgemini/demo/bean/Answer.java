package com.capgemini.demo.bean;

public class Answer {
       private int id;
       private String answer;
       private int istrue;
       private int questionid;
	public Answer(int id, String answer, int istrue, int questionid) {
		super();
		this.id = id;
		this.answer = answer;
		this.istrue = istrue;
		this.questionid = questionid;
	}
	
	
	public Answer() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getIstrue() {
		return istrue;
	}
	public void setIstrue(int istrue) {
		this.istrue = istrue;
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
       
       
	
}
