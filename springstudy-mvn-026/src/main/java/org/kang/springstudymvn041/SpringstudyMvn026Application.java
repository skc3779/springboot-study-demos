package org.kang.springstudymvn041;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Date;
import java.util.Map;

@Controller
@SpringBootApplication
public class SpringstudyMvn026Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringstudyMvn026Application.class, args);
	}

	@GetMapping("/")
	public String home(Map<String, Object> model) {
		model.put("message", "Hello World");
		model.put("title", "Hello Home");
		model.put("date", new Date());
		return "home";
	}

    @RequestMapping("/foo")
    public String foo() {
        throw new RuntimeException("Expected exception in controller");
    }

}

@Configuration
class WebMvcConfig implements WebMvcConfigurer {
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
	}
}

@Configuration
class ApplicationSecurity extends WebSecurityConfigurerAdapter {


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http.authorizeRequests()
				.antMatchers("/public/**").permitAll() // (?)
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
				.anyRequest().fullyAuthenticated()
				.and()
				.formLogin().loginPage("/login").failureUrl("/login?error").permitAll()
				.and()
				.logout().permitAll();
		// @formatter:on
	}

}

/**
 * Security 이벤트를 활용
 * https://docs.spring.io/spring-security/site/docs/5.0.3.RELEASE/api/
 * Package org.springframework.security.authentication.event
 */
@Slf4j
@Component
class AuthenticationEventHandlers {
	@EventListener
	public void hanlderBadCredential(AuthenticationFailureBadCredentialsEvent event) {
		Object principal = event.getAuthentication().getPrincipal();
		log.info("hanlderBadCredential : {}", principal);
	}
}