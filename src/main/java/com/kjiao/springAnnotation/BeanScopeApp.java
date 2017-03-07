package com.kjiao.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		// get bean
		Coach coach = context .getBean("tennisCoach", Coach.class);
		Coach coach2 = context.getBean("tennisCoach", Coach.class);
		// call method
		System.out.println("Pointing to the same object: " + (coach == coach2));
		System.out.println("Memory location: " + coach);
		System.out.println("Memory location: " + coach2);
		// close
		context.close();
	}

}
