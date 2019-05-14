package com.revature.screenforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ScreenforceGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScreenforceGatewayServiceApplication.class, args);
	}
}
