package org.kang.springsutdymvn013.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Value("${app.hello}")
    private String nameHello;

    public String hello() {
        return String.format("name %s",nameHello);
    }
}
