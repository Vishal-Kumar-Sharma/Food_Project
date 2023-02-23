package com.food.foodSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.food.foodSpringApp"})
public class FoodSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodSpringAppApplication.class, args);
	}

}
