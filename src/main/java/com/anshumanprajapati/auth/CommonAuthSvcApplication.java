package com.anshumanprajapati.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.anshumanprajapati.auth"})
@EntityScan(basePackages = {"com.anshumanprajapati.auth.entity"})
@EnableJpaRepositories(basePackages = {"com.anshumanprajapati.auth.repository"})
public class CommonAuthSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonAuthSvcApplication.class, args);
	}

}
