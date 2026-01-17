package com.example.reactive;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.reactive.controller.HelloActions;

@WebMvcTest(HelloActions.class)
class ReactiveApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void shouldReturnHello() throws Exception {
		mockMvc
		.perform(get("/hello"))
		.andExpect(status().isOk())
		.andExpect(content().string("Hello, Github Actions!!"));
	}

}
