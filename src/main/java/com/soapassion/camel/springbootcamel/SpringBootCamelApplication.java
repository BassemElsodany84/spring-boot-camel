package com.soapassion.camel.springbootcamel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication

// load the spring xml file from classpath
@ImportResource("classpath:my-camel.xml")
public class SpringBootCamelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCamelApplication.class, args);
	}

}
