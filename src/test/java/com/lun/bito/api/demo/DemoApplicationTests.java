package com.lun.bito.api.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testRequest() {
		try {
			HttpRequest.newBuilder(new URI("https://postman-echo.com/get"));

			HttpRequest.newBuilder()
					.uri(new URI("https://postman-echo.com/get"));
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		} finally {
		}


	}

}
