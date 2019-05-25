package com.whiteturtlestudio.mysolr.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableJpaRepositories
public class MainApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello My Docker World";
	}
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
