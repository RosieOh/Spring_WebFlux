package com.springwebflux.controller;

import com.springwebflux.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ApiController {

    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/posts/{id}")
    public Mono<String> getPost(@PathVariable int id) {
        return apiService.getPostById(id);
    }
}
