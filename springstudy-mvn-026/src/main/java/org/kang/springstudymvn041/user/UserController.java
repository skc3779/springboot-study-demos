package org.kang.springstudymvn041.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {
    @Autowired
    private HttpMessageConverters converters;


    @RequestMapping("/")
    public String index() {
        converters.getConverters().forEach(e->log.info("{}", e.getClass()));
        return "Hello Spring Mvc";
    }

    @RequestMapping("/user")
    public User user() {
        converters.getConverters().forEach(e->log.info("{}", e.getClass()));
        return new User("name", 30, 180);
    }
}
