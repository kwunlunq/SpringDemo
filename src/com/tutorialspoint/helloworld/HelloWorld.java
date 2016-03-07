package com.tutorialspoint.helloworld;


public class HelloWorld {
	private String message1;
	private String message2;
	
	public HelloWorld() {
	}
	
	public HelloWorld(String msg) {
		this.message1 = msg;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public void getMessage1() {
		System.out.println("World Message 1 : " + message1);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public void getMessage2() {
		System.out.println("World Message 2 : " + message2);
	}

	public void init() {
		System.out.println("World initial ...");
	}

	public void destroy() throws Exception {
		System.out.println("World destorying ...");
	}
}
