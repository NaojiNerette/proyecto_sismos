package com.jbascur.springboot.app.reportes.models;

import java.util.List;

public class ResumenMagnitud {
	
	public double magnitud;
	public List<String> detalles;
	
	public ResumenMagnitud(double magnitud, List<String> detalles) {
		this.magnitud = magnitud;
		this.detalles = detalles;
	}
	
	public double getMagnitud() {
		return magnitud;
	}
	public void setMagnitud(double magnitud) {
		this.magnitud = magnitud;
	}
	public List<String> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<String> detalles) {
		this.detalles = detalles;
	}

	
}
