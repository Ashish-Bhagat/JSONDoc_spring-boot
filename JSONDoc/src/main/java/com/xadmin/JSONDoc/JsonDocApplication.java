package com.xadmin.JSONDoc;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class JsonDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonDocApplication.class, args);
	}

}
