package com.jbascur.springboot.app.reportes.models;

import java.math.BigDecimal;


public class Evento {

	private Long id;
	private String url;
	private String mapUrl;
	private String localDate;
	private String utcDate;
	private BigDecimal latitude;
	private BigDecimal longitude;
	private String magnitude_unidad_medida;
	private Double magnitude_valor;
	private String geoReference;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMapUrl() {
		return mapUrl;
	}
	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}
	public String getLocalDate() {
		return localDate;
	}
	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}
	public String getUtcDate() {
		return utcDate;
	}
	public void setUtcDate(String utcDate) {
		this.utcDate = utcDate;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public String getMagnitude_unidad_medida() {
		return magnitude_unidad_medida;
	}
	public void setMagnitude_unidad_medida(String magnitude_unidad_medida) {
		this.magnitude_unidad_medida = magnitude_unidad_medida;
	}
	public Double getMagnitude_valor() {
		return magnitude_valor;
	}
	public void setMagnitude_valor(Double magnitude_valor) {
		this.magnitude_valor = magnitude_valor;
	}
	public String getGeoReference() {
		return geoReference;
	}
	public void setGeoReference(String geoReference) {
		this.geoReference = geoReference;
	}

	
}
