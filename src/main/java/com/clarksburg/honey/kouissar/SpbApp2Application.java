package com.clarksburg.honey.kouissar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpbApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpbApp2Application.class, args);
	}

}
