package com.kjiao.springAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemo {

	/** 
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		// call method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		// close the context
		context.close();
	}

}
