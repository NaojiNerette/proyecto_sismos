package com.jbascur.springboot.app.reportes.models;

import java.util.HashMap;
import java.util.List;

public class ResumenMagnitud {
	
	public double magnitud;
	public List<HashMap<String,String>> detalles;
	
	public ResumenMagnitud(double magnitud, List<HashMap<String,String>> detalles) {
		this.magnitud = magnitud;
		this.detalles = detalles;
	}
	
	public double getMagnitud() {
		return magnitud;
	}
	public void setMagnitud(double magnitud) {
		this.magnitud = magnitud;
	}
	public List<HashMap<String,String>> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<HashMap<String,String>> detalles) {
		this.detalles = detalles;
	}

	
}
