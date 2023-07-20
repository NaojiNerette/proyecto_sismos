package com.jbascur.springboot.app.eventos.services;

import java.util.List;

import com.jbascur.springboot.app.eventos.models.entity.Evento;

public interface ISismosEventoService {
	
	public List<Evento> findAll();
	public Evento findById(Long id);
	public Evento save(Evento evento);
	public void deleteById(Long id);
}
