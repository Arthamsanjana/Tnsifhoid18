package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.studyeasy.Corolla;
import org.studyeasy.Swift;
import org.studyeasy.interfaces.Car;

@SpringBootApplication
public class WithoutDiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(WithoutDiApplication.class, args);
		
		
		Car swift = new Swift();
		Car corolla = new Corolla();
				
		System.out.println(swift.specs());
		System.out.println(corolla.specs());
				
	}

}
