package org.kang.springsutdymvn013;

import org.kang.springsutdymvn013.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringsutdyMvn009Application {

	@Autowired
	private HelloService helloService;

	@Bean
	public ExitCodeGenerator exitCodeGenerator() {
		return () -> 42;
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringsutdyMvn009Application.class, args);
//		SpringApplication application = new SpringApplication(Application.class);
//		ConfigurableApplicationContext run = application.run(args);
//		System.exit(SpringApplication.exit(run));
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
