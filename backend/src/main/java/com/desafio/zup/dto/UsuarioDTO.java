package com.desafio.zup.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import com.desafio.zup.entities.Carro;
import com.desafio.zup.entities.Usuario;

public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotBlank(message = "Campo obrigatório.")
	private String nome;
	@NotBlank(message = "Campo obrigatório.")
	private String nascimento;

	@Email(message = "Favor inserir um email válido.")
	@NotBlank(message = "Campo obrigatório.")
	private String email;
	
	@NotBlank(message = "Campo obrigatório.")
	@CPF(message = "Digite um CPF válido.")
	private String cpf;
	
	private List <CarroDTO> carros = new ArrayList<>();
	
	public UsuarioDTO(Long id, String nome, String nascimento, String email, @NotBlank(message = "Campo obrigatório.") @CPF(message = "Digite um CPF válido.") @NotBlank(message = "Campo obrigatório.") @CPF(message = "Digite um CPF válido.") String cpf) {
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.email = email;
		this.cpf = cpf;
	}
	
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
		nascimento = entity.getNascimento();
		email = entity.getEmail();
		cpf = entity.getCpf();
	}

	
	public UsuarioDTO() {
	}
	
	
	public UsuarioDTO(Usuario entity, Set<Carro> carros) {
		this(entity);
		carros.forEach(car -> this.carros.add(new CarroDTO(car)));
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	public List<CarroDTO> getCarros() {
		return carros;
	}
	
	public void setCarros(List<CarroDTO> carros) {
		this.carros = carros;
	}

	
}