package com.desafio.zup.dto;

import java.io.Serializable;

public class NewCarroDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer marca;
	private String ano;
	private Integer modelo;
	
	public NewCarroDTO() {
		
	}

	public NewCarroDTO(Long id, Integer marca, String ano, Integer modelo) {
		super();
		this.id = id;
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMarca() {
		return marca;
	}

	public void setMarca(Integer marca) {
		this.marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}
	
}