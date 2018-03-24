package org.kang.springstudymvn001.users;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kang.springstudymvn001.SpringstudyMvn001Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringstudyMvn001Application.class})
public class UserServiceTest {

    /**
     * ComponentScan 테스트 를 위한 서비스 빈등록
     * main : @ComponentScan을 이용한 @Service 스캔
     * test : @SpringBootTest(classes = {SpringstudyMvn001Application.class})
     */
    @Autowired
    UserAnnotationService userAnnotationService;

    /**
     * ComponentScan 테스트 를 위한 서비스 빈등록
     * main : @ComponentScan을 이용한 @configuration 스캔
     * test : @SpringBootTest(classes = {SpringstudyMvn001Application.class})
     */
    @Autowired
    UserNoneAnnotationService userNoneAnnotationService;

    /**
     * 빈 객체 생성 테스트
     */
    @Test
    public void diTest() {
        Assert.assertNotNull(userAnnotationService);
        Assert.assertNotNull(userNoneAnnotationService);
    }

    @Test
    public void diXmlTest() {
        Assert.assertNotNull(userAnnotationService);
    }
}