package com.desafio.zup.dto;

import java.io.Serializable;

import com.desafio.zup.entities.Carro;
import com.desafio.zup.entities.enums.DiaRodizio;

public class CarroDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String marca;
	
	private String ano;
	
	private String modelo;
	
    private String codigoFipe;
	
    private String combustivel;

    private String mesReferencia;

    private String siglaCombustivel;

    private String valor;
    
    private Integer tipoVeiculo;
    
    private boolean rodizio;

    private DiaRodizio diaRodizio;
    
    public CarroDTO() {
    	
    }
    
    public CarroDTO(Carro entity) {
    	id = entity.getId();
    	marca = entity.getMarca();
    	ano = entity.getAno();
    	modelo = entity.getModelo();
    	codigoFipe = entity.getCodigoFipe();
        combustivel = entity.getCombustivel();
        mesReferencia = entity.getMesReferencia();
        siglaCombustivel = entity.getSiglaCombustivel();
        valor = entity.getValor();
        tipoVeiculo = entity.getTipoVeiculo();
        rodizio = entity.isRodizio();
        diaRodizio = entity.getDiaRodizio();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCodigoFipe() {
		return codigoFipe;
	}

	public void setCodigoFipe(String codigoFipe) {
		this.codigoFipe = codigoFipe;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(String mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public String getSiglaCombustivel() {
		return siglaCombustivel;
	}

	public void setSiglaCombustivel(String siglaCombustivel) {
		this.siglaCombustivel = siglaCombustivel;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Integer getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(Integer tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public boolean isRodizio() {
		return rodizio;
	}

	public void setRodizio(boolean rodizio) {
		this.rodizio = rodizio;
	}

	public DiaRodizio getDiaRodizio() {
		return diaRodizio;
	}

	public void setDiaRodizio(DiaRodizio diaRodizio) {
		this.diaRodizio = diaRodizio;
	}
	
}
