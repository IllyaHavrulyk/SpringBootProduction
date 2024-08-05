package com.mdrsolutions.springbootprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.swing.*;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootProdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProdApplication.class, args);
	}

}
