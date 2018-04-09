### HttpMessageConverts

00:00 - Practice. HttpMessageConverters
42:40 - 27.1.4 MessageCodesResolver
53:29 - 27.1.5 Static Content

#### config bean에 명시적으로 지정

```log
2018-04-08 22:52:23.217  INFO 69568 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.ByteArrayHttpMessageConverter
2018-04-08 22:52:23.218  INFO 69568 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.StringHttpMessageConverter
2018-04-08 22:52:23.218  INFO 69568 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.StringHttpMessageConverter
2018-04-08 22:52:23.218  INFO 69568 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.ResourceHttpMessageConverter
2018-04-08 22:52:23.218  INFO 69568 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.ResourceRegionHttpMessageConverter
2018-04-08 22:52:23.218  INFO 69568 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.xml.SourceHttpMessageConverter
2018-04-08 22:52:23.218  INFO 69568 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter
2018-04-08 22:52:23.218  INFO 69568 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
2018-04-08 22:52:23.218  INFO 69568 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
2018-04-08 22:52:23.218  INFO 69568 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter
```

#### 프로퍼티에 매퍼 지정

```log
2018-04-08 22:49:40.445  INFO 62548 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.json.GsonHttpMessageConverter
2018-04-08 22:49:40.446  INFO 62548 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.ByteArrayHttpMessageConverter
2018-04-08 22:49:40.446  INFO 62548 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.StringHttpMessageConverter
2018-04-08 22:49:40.446  INFO 62548 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.StringHttpMessageConverter
2018-04-08 22:49:40.446  INFO 62548 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.ResourceHttpMessageConverter
2018-04-08 22:49:40.446  INFO 62548 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.ResourceRegionHttpMessageConverter
2018-04-08 22:49:40.446  INFO 62548 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.xml.SourceHttpMessageConverter
2018-04-08 22:49:40.446  INFO 62548 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.support.AllEncompassingFormHttpMessageConverter
2018-04-08 22:49:40.447  INFO 62548 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
2018-04-08 22:49:40.447  INFO 62548 --- [nio-8080-exec-1] o.k.s.user.UserController                : class org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter
```

### Day 1.5

pom.xml에 WebJars를 추가함.

```xml
<!-- https://mvnrepository.com/artifact/org.webjars/webjars-locator -->
<dependency>
    <groupId>org.webjars</groupId>
    <artifactId>webjars-locator</artifactId>
    <version>0.33</version>
</dependency>

```

버전을 명시하지 않아도 되는 리소스
```xml
<dependency>
    <groupId>org.webjars</groupId>
    <artifactId>webjars-locator-core</artifactId>
    <version>0.35</version>
</dependency>
```



