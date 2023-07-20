package com.jbascur.springboot.app.eventos.models.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "eventos")
public class Evento implements Serializable {

	@Id
	private Long id;

	private String url;

	@Column(name = "map_url")
	private String mapUrl;

	@Column(name = "local_date")
	private String localDate;

	@Column(name = "utc_date")
	private String utcDate;

	private BigDecimal latitude;

	private BigDecimal longitude;

	private String magnitude_unidad_medida;

	private Double magnitude_valor;

	@Column(name = "geo_reference")
	private String geoReference;

	public Evento() {
	}

	public Evento(Long id, String url, String mapUrl, String localDate, String utcDate, BigDecimal latitude,
			BigDecimal longitude, String magnitude_unidad_medida, Double magnitude_valor, String geoReference) {
		this.id = id;
		this.url = url;
		this.mapUrl = mapUrl;
		this.localDate = localDate;
		this.utcDate = utcDate;
		this.latitude = latitude;
		this.longitude = longitude;
		this.magnitude_unidad_medida = magnitude_unidad_medida;
		this.magnitude_valor = magnitude_valor;
		this.geoReference = geoReference;
	}

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

	private static final long serialVersionUID = 1L;
}
