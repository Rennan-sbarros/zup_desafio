package com.desafio.zup.services.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.desafio.zup.dto.UsuarioDTO;
import com.desafio.zup.entities.Usuario;
import com.desafio.zup.repositories.UsuarioRepository;
import com.desafio.zup.resources.exceptions.FieldMessage;

public class UserInsertValidator implements ConstraintValidator<UserInsertValid, UsuarioDTO> {

	@Autowired
	public UsuarioRepository repository;

	@Override
	public void initialize(UserInsertValid ann) {
	}

	@Override
	public boolean isValid(UsuarioDTO dto, ConstraintValidatorContext context) {

		List<FieldMessage> list = new ArrayList<>();
		Optional<Usuario> userCPF = repository.findByCpf(dto.getCpf());
		Optional<Usuario> userEmail = repository.findByEmail(dto.getEmail());

		if (userCPF != null) {
			list.add(new FieldMessage("cpf", "O CPF já está cadastrado."));
		}

		if (userEmail != null) {
			list.add(new FieldMessage("email", "O E-mail já está cadastrado."));
		}

		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
					.addConstraintViolation();
		}
		return list.isEmpty();
	}
}
