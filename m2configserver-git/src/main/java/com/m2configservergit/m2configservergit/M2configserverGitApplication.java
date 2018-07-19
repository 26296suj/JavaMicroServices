package com.m2configservergit.m2configservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class M2configserverGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(M2configserverGitApplication.class, args);
	}
}
