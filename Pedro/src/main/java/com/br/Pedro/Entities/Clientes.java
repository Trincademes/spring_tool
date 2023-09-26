package com.br.Pedro.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")

public class Clientes {
@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "cliente")
	private String cliente;
	
	@Column(name = "telefone")
	private double telefone;
	
	private Long getIdcCliente() {
		return idcCliente;
	}
	
	public void setIdcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public double getTelefone() {
		return telefone;
	}
	
	public void setTelefone(double telelfone) {
		this.telefone = telefone;
	}
	
	
}
