package com.damifan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class B2_Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(B2_Application.class).web(true).run(args);
	}

}
