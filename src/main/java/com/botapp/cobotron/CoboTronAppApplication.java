package com.botapp.cobotron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CoboTronAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoboTronAppApplication.class, args);
	}

}
