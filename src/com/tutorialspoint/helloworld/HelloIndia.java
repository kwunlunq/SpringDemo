package com.tutorialspoint.helloworld;

public class HelloIndia {

	private String message1;
	private String message2;
	private String message3;
	/**
	 * @return the message1
	 */
	public void getMessage1() {
		System.out.println("India Message1 : " + message1);
	}
	/**
	 * @param message1 the message1 to set
	 */
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	/**
	 * @return the message2
	 */
	public void getMessage2() {
		System.out.println("India Message2 : " + message2);
	}
	/**
	 * @param message2 the message2 to set
	 */
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	/**
	 * @return the message3
	 */
	public void getMessage3() {
		System.out.println("India Message3 : " + message3);
	}
	/**
	 * @param message3 the message3 to set
	 */
	public void setMessage3(String message3) {
		this.message3 = message3;
	}
	
	public void init() {
		System.out.println("India initial ...");
	}

	
	public void destroy() {
		System.out.println("India destroying ...");
	}
}

