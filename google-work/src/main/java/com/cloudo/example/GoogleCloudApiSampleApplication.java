package com.cloudo.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cloudo.example.controller.BookingController;

@SpringBootApplication
public class GoogleCloudApiSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleCloudApiSampleApplication.class, args);
	}
}
