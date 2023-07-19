package com.jbascur.springboot.app.eventos.models;

import org.springframework.data.repository.CrudRepository;

import com.jbascur.springboot.app.eventos.models.entity.Event;

public interface EventDao extends CrudRepository<Event, Long> {

}
