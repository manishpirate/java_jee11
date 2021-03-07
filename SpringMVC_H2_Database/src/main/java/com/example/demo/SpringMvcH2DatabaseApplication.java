package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class is the main class which will start the program, basically a spring boot
 * application. The class needs to be have one annotation spring boot application. 
 * @author manishsharma
 *
 */
@SpringBootApplication
public class SpringMvcH2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcH2DatabaseApplication.class, args);
	}

}
