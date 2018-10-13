package com.capgemini.demo.bean;

public class User {
      private int id;
      private String identity;
      private Paper paper;
      
	public User(int id, String identity) {
		super();
		this.id = id;
		this.identity = identity;
	}
	
	
	public User() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getIdentity() {
		return identity;
	}


	public void setIdentity(String identity) {
		this.identity = identity;
	}


	public Paper getPaper() {
		return paper;
	}


	public void setPaper(Paper paper) {
		this.paper = paper;
	}
      
	
	
      
	
	
}
