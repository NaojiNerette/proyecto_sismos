package com.jbascur.springboot.app.eventos.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbascur.springboot.app.eventos.models.entity.Evento;
import com.jbascur.springboot.app.eventos.services.SismosEventoService;


@RestController
@RequestMapping("/eventos")
public class EventoController {	
	
	@Autowired 
	SismosEventoService sismosEventoService;
	
	
	@GetMapping("/listar")
	public List<Evento> listar(){
		return sismosEventoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Evento detalle(@PathVariable Long id) {
		return sismosEventoService.findById(id);
	}
}
