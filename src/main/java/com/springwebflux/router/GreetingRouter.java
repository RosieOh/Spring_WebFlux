package com.springwebflux.router;

import com.springwebflux.handler.GreetingHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class GreetingRouter {

    @Bean
    public RouterFunction<ServerResponse> greetingRouter(GreetingHandler handler) {
        return route(GET("/greet"), handler::greet);
    }
}
