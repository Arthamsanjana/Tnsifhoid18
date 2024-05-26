package org.studyeasy.cars;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component
public class Audi implements Car {

	public String specs() {
		return "Audi is from xyz";
	}

}
