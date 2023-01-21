package com.jkngil.pos.api.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PosAppApiDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosAppApiDiscoveryServiceApplication.class, args);
	}

}
