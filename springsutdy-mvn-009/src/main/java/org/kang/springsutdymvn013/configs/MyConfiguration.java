package org.kang.springsutdymvn013.configs;

import org.kang.springsutdymvn013.props.AcmeProperties;
import org.kang.springsutdymvn013.props.ThirdProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 아래의 클래스와 같은 EnableConfigurationProperties annotation에 등록된
 * 프로퍼티 클래스가 필요하다.
 * <pre>
 *  @ConfigurationProperties("acme")
 *  public class AcmeProperties {
 *      private final List<MyPojo> list = new ArrayList<>();
 *
 *      public List<MyPojo> getList() {
 *          return this.list;
 *      }
 *  }
 * </pre>
 */
@Configuration
@EnableConfigurationProperties(AcmeProperties.class)
public class MyConfiguration {

    /**
     * Third-party Configuration
     * Third-party 클래스에 properties 값을 등록하기 위해서는
     * @Bean에 ConfigurationProperties @annotation을 적용하여
     * 등록해주는 방법도 지원한다.
     * @return
     */
    @Bean
    @ConfigurationProperties("third")
    public ThirdProperties thirdProperties() {
        return new ThirdProperties();
    }


}
