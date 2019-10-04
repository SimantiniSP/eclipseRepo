package com.lti.model;

import java.util.List;

public class Question {
	
	private String question;//each question
	private List<Option> options;//options associated with it |size of option may vary therefore List
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	

}
