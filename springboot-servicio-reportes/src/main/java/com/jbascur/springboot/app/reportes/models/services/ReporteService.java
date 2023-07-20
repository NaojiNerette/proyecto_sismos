package com.jbascur.springboot.app.reportes.models.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jbascur.springboot.app.reportes.models.Evento;
import com.jbascur.springboot.app.reportes.models.Reporte;
import com.jbascur.springboot.app.reportes.models.ResumenMagnitud;

@Service
public class ReporteService implements IReporteService{

	private final AtomicLong valorMagnitud = new AtomicLong();
	
	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Evento> eventosOriginal() {
		List<Evento> eventos = Arrays.asList(
				clienteRest.getForObject("http://localhost:8090/eventos/listar", Evento[].class));
		
		return eventos;
	}

	@Override
	public Reporte reporteEventosPorMagnitud() {
		List<Evento> eventos = Arrays.asList(
				clienteRest.getForObject("http://localhost:8090/eventos/listar", Evento[].class));
		
		List<ResumenMagnitud> resumenes = eventos.stream()
				.map(evento -> {
					
					List<String> detalle = new ArrayList<String>();
					String cadenaEvento =  evento.getId().toString()
							.concat(" - ").concat(evento.getGeoReference())
							.concat(" - ").concat(evento.getLocalDate())
							.concat(" - ").concat(evento.getUtcDate());
					
					
					//if(valorMagnitud.get() != evento.getMagnitude_valor().longValue())
					//{
						valorMagnitud.set(evento.getMagnitude_valor().longValue());
						detalle.add(cadenaEvento);
						return new ResumenMagnitud(evento.getMagnitude_valor(), detalle);	
					//}	
					
				})
				.collect(Collectors.toList());
		
		resumenes = resumenes.stream()
				.sorted(Comparator.comparingDouble(ResumenMagnitud::getMagnitud).reversed())
				.collect(Collectors.toList());
		
		return new Reporte(Long.valueOf("1"), "Reporte con los eventos ordenados por magnitud", resumenes);
	}
}
