package com.desafio.zup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.zup.entities.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

//	List<Carro> findByUsuario(Usuario id);
//
//    void deleteById(Long idCarro);

}
