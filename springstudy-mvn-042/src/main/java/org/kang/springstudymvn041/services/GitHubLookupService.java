package org.kang.springstudymvn041.services;

import lombok.extern.slf4j.Slf4j;
import org.kang.springstudymvn041.entities.User;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class GitHubLookupService {

    private final RestTemplate restTemplate;

    public GitHubLookupService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    public CompletableFuture<User> findUser(String user) throws InterruptedException {
        log.info("Looking up : " + user);
        String url = String.format("https://api.github.com/users/%s", user);
        User u = restTemplate.getForObject(url, User.class);

        // 딜레이 1초 발생
        Thread.sleep(1000L);

        return CompletableFuture.completedFuture(u);
    }
}
