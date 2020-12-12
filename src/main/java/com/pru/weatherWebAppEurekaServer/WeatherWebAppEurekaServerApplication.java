package com.pru.weatherWebAppEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WeatherWebAppEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherWebAppEurekaServerApplication.class, args);
	}

}
