package com.kjiao.springAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("thisSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach{

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("ramdomFortuneService")
	private FortuneService fortuneService;
	
	// constructor injection
//	@Autowired  
//	public TennisCoach(FortuneService service) {
//		this.fortuneService = service;
//	}
	public TennisCoach() {
		System.out.println("TennisCoach default constructor");
	}
	
	// define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach init method");
	}
	// define my destroy method
	@PreDestroy
	public void doMyCleanStuff() {
		System.out.println("TennisCoach destroy method");
	}
	
	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getCoachInfo() {
		return "Email: " + this.email + ", " + this.team;
	}
	
	// setter injection
//	@Autowired
//	public void setFortuneService(FortuneService service) {
//		System.out.println("Tennis coach: inside fortuneService");
//		this.fortuneService = service;
//	}
	
	// method injection
//	@Autowired
//	public void initService(FortuneService service) {
//		System.out.println("Tennis coach: init fortuneService");
//		this.fortuneService = service;
//	}
}
 