package com.cbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CalculatorAppApplication {

	public static void main(String[] args) {
//		ConfigurableApplicationContext con=
		SpringApplication.run(CalculatorAppApplication.class, args);
//		CalculatorController calc=con.getBean(CalculatorController.class);
		
	}

}
