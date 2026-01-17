package com.example.reactive;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.reactive.controller.HelloActions;

@WebFluxTest(HelloActions.class)
class ReactiveApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void shouldReturnHello() {
		webTestClient.get()
		.uri("/hello")
		.exchange()
		.expectStatus().isOk()
		.expectBody(String.class)
		.isEqualTo("Hello, Github Actions!!");
	}

}
