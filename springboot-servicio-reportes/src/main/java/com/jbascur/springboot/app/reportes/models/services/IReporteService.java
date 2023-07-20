package com.jbascur.springboot.app.reportes.models.services;

import java.util.List;

import com.jbascur.springboot.app.reportes.models.Evento;
import com.jbascur.springboot.app.reportes.models.Reporte;

public interface IReporteService {

	public List<Evento> eventosOriginal();
	public Reporte reporteEventosPorMagnitud();
}
