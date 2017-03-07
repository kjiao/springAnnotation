package com.kjiao.springAnnotation;

import org.springframework.beans.factory.annotation.Value;


public class SwimCoach implements Coach{
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService service) {
		System.out.println("SwimCoach default constructor");
		this.fortuneService = service;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
 