package org.kang.springstudygradle001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringstudyGradle001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringstudyGradle001Application.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World";
	}

}
