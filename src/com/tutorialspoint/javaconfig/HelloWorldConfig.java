package com.tutorialspoint.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorialspoint.helloworld.HelloWorld;

@Configuration
public class HelloWorldConfig {

	/**
	 * Same as 
	 * <beans> 
	 *   <bean id="helloWorld" class="com.tutorialspoint.HelloWorld" />
	 * </beans>
	 * 
	 * @return
	 */
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld("hello this world");
	}

	@Bean
	public HelloWorld helloAnotherWorld() {
		return new HelloWorld("hello another world !");
	}
	
}
