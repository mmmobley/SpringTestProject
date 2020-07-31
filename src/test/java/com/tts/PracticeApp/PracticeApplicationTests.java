package com.tts.PracticeApp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PracticeApplicationTests {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
//	private SubscriberController controller;
	
//	@Test
//	void contextLoads() {
//		//assertNotNullcontroller);
//		assertThat(controller).isNotNull();
//	}
	
	@Test
	void shouldReturnInfo() throws Exception {
		assertThat(this.restTemplate.getForObject("http//localhost:" + port, String.class))
		.contains("Welcome to my site dedicated to the best restaurants in San Antonio");
	}
}
