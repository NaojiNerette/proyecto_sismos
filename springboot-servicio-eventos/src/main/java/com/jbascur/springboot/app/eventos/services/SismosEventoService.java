package com.jbascur.springboot.app.eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbascur.springboot.app.eventos.models.EventoDao;
import com.jbascur.springboot.app.eventos.models.entity.Evento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SismosEventoService implements ISismosEventoService {

	@Autowired
	private EventoDao eventoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Evento> findAll() {
		return (List<Evento>) eventoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Evento findById(Long id) {
		return eventoDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Evento save(Evento evento) {
		return eventoDao.save(evento);
	}
	
	@Override
	@Transactional
	public void deleteById(Long id) {
		eventoDao.deleteById(id);
	}
	
}
