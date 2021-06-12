package com.desafio.zup.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafio.zup.dto.CarroDTO;
import com.desafio.zup.dto.UsuarioDTO;
import com.desafio.zup.entities.Carro;
import com.desafio.zup.entities.Usuario;
import com.desafio.zup.repositories.CarroRepository;
import com.desafio.zup.repositories.UsuarioRepository;
import com.desafio.zup.services.exceptions.ResourceNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CarroRepository carroRepository;

	@Transactional(readOnly = true)
	public List<UsuarioDTO> findAll() {
		List <Usuario> list = usuarioRepository.findAll();
		return list.stream().map(x -> new UsuarioDTO(x)).collect(Collectors.toList());

	}

	@Transactional(readOnly = true)
	public UsuarioDTO findById(Long id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		Usuario entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new UsuarioDTO(entity, entity.getCarros());
	}

	@Transactional
	public UsuarioDTO insert(UsuarioDTO dto) {

		Usuario entity = new Usuario();
		copyDtoToEntity(dto, entity);
		entity = usuarioRepository.save(entity);
		return new UsuarioDTO(entity);
	}
	
	private void copyDtoToEntity(UsuarioDTO dto, Usuario entity) {
		entity.setNome(dto.getNome());
		entity.setNascimento(dto.getNascimento());
		entity.setCpf(dto.getCpf());
		entity.setEmail(dto.getEmail());
		
		entity.getCarros().clear();
		for (CarroDTO carDto : dto.getCarros()) {
			Carro carro = carroRepository.getOne(carDto.getId());
			entity.getCarros().add(carro);
		}
	}

}
