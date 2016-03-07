package com.tutorialspoint.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tutorialspoint/annotation/Beans.xml");
		
		TextEditor editor = (TextEditor) context.getBean("TextEditor");
		
		editor.spellCheck();

	}

}
