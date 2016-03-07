package com.tutorialspoint.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tutorialspoint/helloworld/Beans.xml");
		
		System.out.println("Start getting bean");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.getMessage1();
		objA.getMessage2();
		
		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");

		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		
	}
}
