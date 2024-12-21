package com.springwebflux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest(DemoControllerTest.class)
public class DemoControllerTest {

    @Autowired
    private WebTestClient wt;
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void testSayHello() {
        webTestClient.get()
                .uri( "/hello")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .isEqualTo("Hello, WebFlux!");
    }
}
