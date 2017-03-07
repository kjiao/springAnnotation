package com.kjiao.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

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
		// read spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		// 显示指明component id
		// Coach theCoach = context.getBean("thisSillyCoach", Coach.class);
		// 使用默认方法
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		// call method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getCoachInfo());
		// close the context
		context.close();
	}

}
