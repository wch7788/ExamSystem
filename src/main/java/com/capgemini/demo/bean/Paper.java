package com.capgemini.demo.bean;

import java.util.List;

public class Paper {
	private int id;
	private int userid;
	private int grade;
	private List<PaperQuestion> paperquestions;
	
	
	public Paper(int id, int userid, int grade) {
		super();
		this.id = id;
		this.userid = userid;
		this.grade = grade;
	}
	
	
	public Paper() {
		super();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}


	public List<PaperQuestion> getPaperquestions() {
		return paperquestions;
	}


	public void setPaperquestions(List<PaperQuestion> paperquestions) {
		this.paperquestions = paperquestions;
	}


	
	

}
