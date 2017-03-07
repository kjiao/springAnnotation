package com.kjiao.springAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RamdomFortuneService implements FortuneService {

	private String[] fortunes = {
			"Beware of the wolf in sheep's clothing", 
			"The journey is the reward",
			"Diligence is the mother of good luck"
	};
	
	public String getFortune() {
		Random random = new Random();
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}
