package com.springwebflux.handler;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@CommonsLog
public class GreetingHandler {

    public Mono<ServerResponse> greet(ServerRequest request) {
        return ServerResponse.ok().bodyValue("Hello from Handler!");
    }
}
