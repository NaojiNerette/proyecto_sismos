package com.jbascur.springboot.app.eventos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jbascur.springboot.app.eventos.services.DataService;

@SpringBootApplication
public class SpringbootServicioEventosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioEventosApplication.class, args);

	}

	@Autowired
	private DataService dataService;
	
	@Override
	public void run(String... args) throws Exception {
		dataService.cargaData();
	}

}
