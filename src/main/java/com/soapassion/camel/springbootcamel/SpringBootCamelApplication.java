package com.soapassion.camel.springbootcamel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@SpringBootApplication

// load the spring xml file from classpath
@ImportResource("classpath:camel-context.xml")
public class SpringBootCamelApplication {


	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCamelApplication.class, args);
	}


	@Component
	class StudentRoute extends RouteBuilder {

		@Override
		public void configure() {
			restConfiguration()
					.component("servlet").contextPath("/camel-rest-jpa")
					.apiProperty("api.title", "Camel REST API")
					.apiProperty("api.version", "1.0")
					.apiProperty("cors", "true")
					.apiContextRouteId("doc-api")
					.bindingMode(RestBindingMode.json);






		}
	}
}
