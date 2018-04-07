package org.kang.springsutdymvn013;

import org.kang.springsutdymvn013.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Day 13 lecture
 * 00:11 - 27. Developing Web Applications
 * 06:35 - 27.1 The “Spring Web MVC Framework”
 * 09:26 - 27.1.1 Spring MVC Auto-configuration
 * 33:09 - 27.1.2 HttpMessageConverters
 * 58:13 - 27.1.3 Custom JSON Serializers and Deserializers
 */
@RestController
@SpringBootApplication
public class SpringsutdyMvn013Application {

	@Autowired
	private HelloService helloService;

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 42;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringsutdyMvn013Application.class, args);
	}

	@RequestMapping("/hello")
	public String hello() {
		return helloService.hello();
	}

	@RequestMapping("/acme")
	public String acme() {
		return helloService.acme();
	}

	@RequestMapping("/third")
	public String third() {
		return helloService.third();
	}
}
