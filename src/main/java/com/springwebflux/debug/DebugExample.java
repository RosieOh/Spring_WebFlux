package com.springwebflux.debug;

import reactor.core.publisher.Hooks;
import reactor.core.publisher.Mono;

public class DebugExample {
    public static void main(String[] args) {
        Hooks.onOperatorDebug();

        Mono.just("Hello")
                .map(String::toUpperCase)
                .doOnNext(System.out::println)
                .subscribe();
    }
}
