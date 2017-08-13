package com.ybliu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
@RestController
public class FireluoliApplication {

	public static void main(String[] args) {
		SpringApplication.run(FireluoliApplication.class, args);
	}

	@RequestMapping("index")
	public String index(){
		return "hello man";
	}
}
