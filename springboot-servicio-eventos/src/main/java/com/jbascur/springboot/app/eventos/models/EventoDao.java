package com.jbascur.springboot.app.eventos.models;

import org.springframework.data.repository.CrudRepository;

import com.jbascur.springboot.app.eventos.models.entity.Evento;

public interface EventoDao extends CrudRepository<Evento, Long> {

}
