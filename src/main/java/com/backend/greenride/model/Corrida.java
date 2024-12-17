package com.backend.greenride.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_corrida")
public class Corrida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String embarque;
	
	@NotNull
	private String destino;
	
	@NotNull
	private Double distanciaKm;
	
	@NotNull
	private Double velocidadeKh;
	
	private Double valor;
	
	private Double tempo;
	
	@ManyToOne
	@JsonIgnoreProperties("corrida")
	private Motorista motorista;
	
	@ManyToOne
	@JsonIgnoreProperties("usuario")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmbarque() {
		return embarque;
	}

	public void setEmbarque(String embarque) {
		this.embarque = embarque;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getDistanciaKm() {
		return distanciaKm;
	}

	public void setDistanciaKm(Double distanciaKm) {
		this.distanciaKm = distanciaKm;
	}

	public Double getVelocidadeKh() {
		return velocidadeKh;
	}

	public void setVelocidadeKh(Double velocidadeKh) {
		this.velocidadeKh = velocidadeKh;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getTempo() {
		return tempo;
	}

	public void setTempo(Double tempo) {
		this.tempo = tempo;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	
	
}
