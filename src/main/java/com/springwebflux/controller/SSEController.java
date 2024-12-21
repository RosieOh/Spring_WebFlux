package com.springwebflux.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

@RestController
public class SSEController {

    @GetMapping(value = "/sse/updates", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> sseUpdates() {
        return Flux.fromStream(Stream.generate(() -> "Update at " + System.currentTimeMillis()))
                .delayElements(Duration.ofSeconds(2)); //매 2초 마다 새로운 데이터 전송
    }
}
