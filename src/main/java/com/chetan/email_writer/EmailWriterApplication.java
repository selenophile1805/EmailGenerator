package com.chetan.email_writer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class EmailWriterApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmailWriterApplication.class, args);



	}

}
