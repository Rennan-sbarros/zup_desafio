package com.desafio.zup.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.desafio.zup.entities.Carro;

@FeignClient(name = "ParallelumService", url = "https://parallelum.com.br")
public interface FipeApiService {
	
	@GetMapping("/fipe/api/v1/carros/marcas/{marca}/modelos/{modelo}/anos/{ano}")
    Carro get(@PathVariable Integer marca, @PathVariable Integer modelo, @PathVariable String ano);
	
}
