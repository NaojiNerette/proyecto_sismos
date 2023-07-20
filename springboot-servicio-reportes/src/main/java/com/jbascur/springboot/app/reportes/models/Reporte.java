package com.jbascur.springboot.app.reportes.models;

import java.util.List;

public class Reporte {

	public Long id;
	public String nombre;
	public List<ResumenMagnitud> resumenes;

	public Reporte() {
	}

	public Reporte(Long id, String nombre, List<ResumenMagnitud> resumenes) {
		this.id = id;
		this.nombre = nombre;
		this.resumenes = resumenes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<ResumenMagnitud> getEventos() {
		return resumenes;
	}

	public void setEventos(List<ResumenMagnitud> resumenes) {
		this.resumenes = resumenes;
	}

}
