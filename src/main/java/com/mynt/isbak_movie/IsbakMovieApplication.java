package com.mynt.isbak_movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

@EnableGlobalAuthentication
@SpringBootApplication
public class IsbakMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsbakMovieApplication.class, args);
	}

}
