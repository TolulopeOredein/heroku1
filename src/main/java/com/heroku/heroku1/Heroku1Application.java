package com.heroku.heroku1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Heroku1Application {

	public static void main(String[] args) {
		SpringApplication.run(Heroku1Application.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World!";
	}

}
