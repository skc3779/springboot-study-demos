package org.kang.springstudymvn016.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Bean
    public HttpMessageConverters converters() {
        return new HttpMessageConverters(new GsonHttpMessageConverter());
    }

}
