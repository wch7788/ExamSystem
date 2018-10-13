package com.capgemini.demo.bean;

public class PaperQuestion {
  private int id;
  private int paperid;
  private int questionid;
  private Answer answer;
  private Question question;
  
public PaperQuestion(int id, int paperid, int questionid) {
	super();
	this.id = id;
	this.paperid = paperid;
	this.questionid = questionid;
}
public PaperQuestion() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPaperid() {
	return paperid;
}
public void setPaperid(int paperid) {
	this.paperid = paperid;
}
public int getQuestionid() {
	return questionid;
}
public void setQuestionid(int questionid) {
	this.questionid = questionid;
}
public Answer getAnswer() {
	return answer;
}
public void setAnswer(Answer answer) {
	this.answer = answer;
}
public Question getQuestion() {
	return question;
}
public void setQuestion(Question question) {
	this.question = question;
}
  
  
  
}
