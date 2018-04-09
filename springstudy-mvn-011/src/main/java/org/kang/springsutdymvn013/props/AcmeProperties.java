package org.kang.springsutdymvn013.props;

import org.kang.springsutdymvn013.entities.MyPojo;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * 아래와 같이 @Component로 등록하면
 * <pre>
 *  @Component
 *  @ConfigurationProperties("acme")
 *  public class AcmeProperties {
 *      ...
 *  }
 * </pre>
 *
 * 사용 클래스(서비스)에서 아래와 같이 Bean에 주입해서 사용하면됩니다.
 * <pre>
 *  @Autowired
 *  private AcmeProperties acmeProperties;
 * </pre>
 *
 * 또는 Bean 등록없이 사용시에는
 * <pre>
 *  @ConfigurationProperties("acme")
 *  public class AcmeProperties {
 *      ..
 *  }
 * </pre>
 *
 * @EnableConfigurationProperties를 annotation에 프로퍼티 클래스를
 * 등록해 사용한다.
 * <pre>
 *  @Configuration
 *  @EnableConfigurationProperties(AcmeProperties.class)
 *      public class MyConfiguration {
 *  }
 * </pre>
 *
 */
// @Component
@ConfigurationProperties("acme")
public class AcmeProperties {
    private final List<MyPojo> list = new ArrayList<>();
    public List<MyPojo> getList() {
        return this.list;
    }
}
