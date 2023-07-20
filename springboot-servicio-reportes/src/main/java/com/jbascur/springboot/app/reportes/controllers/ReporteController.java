package com.jbascur.springboot.app.reportes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbascur.springboot.app.reportes.models.Evento;
import com.jbascur.springboot.app.reportes.models.Reporte;
import com.jbascur.springboot.app.reportes.models.services.ReporteService;

@RestController
@RequestMapping("/reportes")
public class ReporteController {

	@Autowired
	private ReporteService reporteService;
	
	@GetMapping("/listarOriginal")
	public List<Evento> eventosOriginal(){
		return reporteService.eventosOriginal();
	}
	
	@GetMapping("/eventosPorMagnitud")
	public Reporte reporteEventosPorMagnitud() {
		return reporteService.reporteEventosPorMagnitud();
	}
}
