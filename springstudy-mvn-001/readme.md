
### maven

### compile

```cmd
$ mvn compile
```

### Running the Example

```cmd
$ mvn spring-boot:run
```


### Creating an Executable Jar
```xml
<build>
	<plugins>
		<plugin>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-maven-plugin</artifactId>
		</plugin>
	</plugins>
</build>
```

```cmd
$ mvn clean package
```

### 컴포넌트 등록방법에 대한 설명

    > https://www.youtube.com/watch?v=w9wqpnLHnkY&index=3&list=PLfI752FpVCS8tDT1QEYwcXmkKDz-_6nm3

```java

/*하위 클래스의 모든 컴포넌트를 스캔한다.*/
@ComponentScan 

/* 직접 컴포넌트를 임포트 한다. */
@Import(value = {ServiceConfig.class, UserAnnotationService.class}) 

public class SpringstudyMvn001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringstudyMvn001Application.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World";
	}
}
```

```java


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
}

```

### jar 실행

```cmd
$ java -jar target/springstudy-mvn-001-0.0.1-SNAPSHOT.jar --debug 
```