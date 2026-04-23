package com.radar.hexagonalarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HexagonalarchApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalarchApplication.class, args);
	}

}
