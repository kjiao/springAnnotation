package com.kjiao.springAnnotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	public String getFortune() {
		return "DatabaseFortuneService";
	}

}
