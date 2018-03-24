package org.kang.springstudymvn001.configs;

import org.kang.springstudymvn001.users.UserNoneAnnotationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public UserNoneAnnotationService userNoneAnnotationService() {
        return new UserNoneAnnotationService();
    }
}
