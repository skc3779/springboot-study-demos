package org.kang.springstudymvn004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringstudyMvn004Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringstudyMvn004Application.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
}
