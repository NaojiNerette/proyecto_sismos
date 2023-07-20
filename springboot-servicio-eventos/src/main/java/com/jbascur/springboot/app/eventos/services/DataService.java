package com.jbascur.springboot.app.eventos.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jbascur.springboot.app.eventos.models.EventoDao;
import com.jbascur.springboot.app.eventos.models.entity.Evento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DataService implements IDataService{
	
	@Autowired
	private EventoDao eventoDao;
	
	@Autowired
	RestTemplate clienteRest;
	
	@Override
	public void cargaData() {
		
		ResponseEntity<HashMap> eventos = 
				clienteRest.exchange("https://api.xor.cl/sismo/recent", 
					HttpMethod.GET,
					HttpEntity.EMPTY,
					new ParameterizedTypeReference<HashMap>() {
					}
				);
		
			
			ArrayList<Map<String, Object>> listaEventos = 
					(ArrayList<Map<String, Object>>)eventos.getBody().get("events");
			
			List<Evento> events = listaEventos.stream()
					.map(mapa -> {						
						Map<String, Object> magnitudes = (Map<String, Object>)mapa.get("magnitude");
						
						return new Evento(Long.parseLong(mapa.get("id").toString()),
								 String.valueOf(mapa.get("url")),
								 String.valueOf(mapa.get("map_url")),
								 String.valueOf(mapa.get("local_date")),
								 String.valueOf(mapa.get("utc_date")),
								 BigDecimal.valueOf(0.0),//(BigDecimal)map.get("latitude"),
								 BigDecimal.valueOf(0.0), //(BigDecimal)map.get("longitude"),
								 String.valueOf(magnitudes.get("measure_unit")),
								 Double.valueOf(magnitudes.get("value").toString()),
								 String.valueOf(mapa.get("geo_reference")));
					})
					//.peek(e -> System.out.println(e))
					.collect(Collectors.toList());
						
			eventoDao.saveAll(events);		
	}

}
