package com.tutorialspoint.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tutorialspoint.helloworld.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		ctx.register(TextEditorConfig.class);
		ctx.register(HelloWorldConfig.class);
		ctx.refresh();
		
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.getMessage1();
		
		
		
	}
}
