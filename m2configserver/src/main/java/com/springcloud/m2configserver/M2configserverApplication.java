package com.springcloud.m2configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class M2configserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(M2configserverApplication.class, args);
	}
}
