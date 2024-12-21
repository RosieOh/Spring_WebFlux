package com.springwebflux.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Mono<Void> handleIllegalArgument(ServerWebExchange exchange, IllegalArgumentException e) {
        exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
        return Mono.empty();
    }
}
