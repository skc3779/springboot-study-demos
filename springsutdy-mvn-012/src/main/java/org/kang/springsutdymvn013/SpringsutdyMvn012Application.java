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
 * Day 12 lecture
 * url : https://www.youtube.com/watch?v=uVR2iBEb474&list=PLfI752FpVCS8tDT1QEYwcXmkKDz-_6nm3&index=12
 * - logback-spring.xml
 *   springProfile
 *   springProperty
 * 1:10 - 26.5 Custom Log Configuration
 * 3:40 - 26.6 Logback Extensions
 * 6:39 - 26.6.1 Profile-specific Configuration
 * 2:28 - 26.6.2 Environment Properties
 */
@RestController
@SpringBootApplication
public class SpringsutdyMvn012Application {

	@Autowired
	private HelloService helloService;

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 42;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringsutdyMvn012Application.class, args);
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
