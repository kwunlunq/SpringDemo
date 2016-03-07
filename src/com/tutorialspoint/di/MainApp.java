package com.tutorialspoint.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tutorialspoint/di/Beans.xml");
		
		// injecting inner beans
		TextEditor editor = (TextEditor) context.getBean("TextEditorWireType");
		editor.spellCheck();
		
		System.out.println(" --- ");
		
		// injecting collection
		JavaCollection jc = (JavaCollection) context.getBean("JavaCollection");
		jc.getAddressList();
		jc.getAddressMap();
		jc.getAddressProp();
		
		System.out.println("finished");
	}

}
