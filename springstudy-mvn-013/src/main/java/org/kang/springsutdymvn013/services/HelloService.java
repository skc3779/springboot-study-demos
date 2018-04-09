package org.kang.springsutdymvn013.services;

import org.kang.springsutdymvn013.props.AcmeProperties;
import org.kang.springsutdymvn013.props.ThirdProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class HelloService {

    @Value("${hello}")
    private String nameHello;

    /**
     * AcmeProperties를 @Component를 이용해서 주입
     */
//    @Autowired
    private AcmeProperties acmeProperties;

    @Autowired
    private ThirdProperties thirdProperties;

    /**
     * @EnableConfigurationProperties annotation을 이용해서 주입
     * @param acmeProperties
     */
    @Autowired
    public HelloService(AcmeProperties acmeProperties) {
        this.acmeProperties = acmeProperties;
    }

    public String hello() {
        return String.format("name %s", nameHello);
    }

    public String acme() {
        return acmeProperties.getList().stream().map(m->m.getName()).collect(Collectors.joining(","));
    }

    public String third() {
        return thirdProperties.getList().stream().map(m->m.getName()).collect(Collectors.joining(","));
    }
}
