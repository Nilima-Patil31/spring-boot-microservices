package com.first;

import com.first.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
/*
@Configuration
@ComponentScan("com.first")
@EnableAutoConfiguration
*/
//@ComponentScan(basePackages = {"com.first","pack"})
public class FirstBootProjectApplication {
	/*@Bean
	public HomeController getController(){
		return new HomeController();
	}*/
	public static void main(String[] args) {

		//bootstraping your spring boot application
		SpringApplication.run(FirstBootProjectApplication.class, args);

	}

}
