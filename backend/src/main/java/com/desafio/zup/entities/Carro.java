package com.desafio.zup.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import com.desafio.zup.entities.enums.DiaRodizio;
import com.desafio.zup.utils.StringUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tb_carro")
public class Carro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Campo obrigatório.")
	@JsonProperty(value = "Marca")
	private String marca;
	
	@NotBlank(message = "Campo obrigatório.")
	@JsonProperty(value = "AnoModelo")
	private String ano;
	
	@NotBlank(message = "Campo obrigatório.")
	@JsonProperty(value = "Modelo")
	private String modelo;
	
	@JsonProperty(value = "CodigoFipe")
    private String codigoFipe;
	
    @JsonProperty(value = "Combustivel")
    private String combustivel;

    @JsonProperty(value = "MesReferencia")
    private String mesReferencia;

    @JsonProperty(value = "SiglaCombustivel")
    private String siglaCombustivel;

    @JsonProperty(value = "Valor")
    private String valor;
    
    @JsonProperty(value = "TipoVeiculo")
    private Integer tipoVeiculo;
    
    @Transient
    private boolean rodizio;

    @Transient
    private DiaRodizio diaRodizio;

	public Carro() {

	}

	public Carro(Long id, String marca, String ano, String modelo) {
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
	
	public DiaRodizio getDiaRodizio() {
        return DiaRodizio.getFromRange(StringUtils.getLastStringFromValue(this.ano.toString()));
    }

    public boolean isRodizio() {
        LocalDate today = LocalDate.now();
        return DiaRodizio.getFromDayOfWeek(today.getDayOfWeek().getValue()) == this.getDiaRodizio();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
