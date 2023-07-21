package com.jbascur.springboot.app.reportes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootServicioReportesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioReportesApplication.class, args);
	}

}
