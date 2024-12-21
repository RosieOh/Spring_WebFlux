package com.springwebflux.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> route() {
        return RouterFunctions.route(GET("/api/hello-router"), req -> ok().bodyValue("Hello from Router!"));
    }
}
