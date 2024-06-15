package com.kishore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CalculatorAppApplication {

	public static void main(String[] args) {
		//This context can access beans that are created by default in the spring application

//		ConfigurableApplicationContext con=
				SpringApplication.run(CalculatorAppApplication.class, args);

//		compcls cls=con.getBean(compcls.class);
//		cls.mann();
	}

}
