package com.example.restservice;

public class Greeting {

	private  long id;
	private  String content;
	private String testing;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
//	public String getTesting() {
//		System.out.println("test3");
//		return testing;
//	}
}
