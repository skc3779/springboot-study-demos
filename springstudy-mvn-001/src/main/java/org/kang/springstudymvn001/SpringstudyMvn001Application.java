package org.kang.springstudymvn001;

import org.kang.springstudymvn001.configs.ServiceConfig;
import org.kang.springstudymvn001.users.UserAnnotationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@Configuration
//@ComponentScan /*하위 클래스의 모든 컴포넌트를 스캔한다.*/
//@Import(value = {ServiceConfig.class, UserAnnotationService.class}) /* 직접 컴포넌트를 임포트 한다. */
//@ImportResource(locations = {"servicebean.xml"}) /* xml configuration 사용 */
public class SpringstudyMvn001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringstudyMvn001Application.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World";
	}
}
