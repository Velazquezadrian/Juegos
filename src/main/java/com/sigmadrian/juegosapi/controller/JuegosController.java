package com.sigmadrian.juegosapi.controller;

import java.util.List;

import com.sigmadrian.juegosapi.entity.DTO.JuegosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sigmadrian.juegosapi.entity.Juegos;
import com.sigmadrian.juegosapi.service.IJuegosService;

@RestController
@RequestMapping("/api")
public class JuegosController {
	
	@Autowired
	private IJuegosService serviceJuegos;
	
	@GetMapping("/")
	public List<Juegos> findAll(){
		return serviceJuegos.buscarTodos();
	}
	
	@GetMapping(value="/titulo" , params="titulo")
	public List<Juegos> findByTitulo(@RequestParam String titulo){
		return serviceJuegos.buscarTitulo(titulo);
	}

	@PostMapping(value="/titulazo" , consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Juegos> findByTitulos(@RequestBody JuegosDTO juegosDTO){
		return serviceJuegos.buscarTitulo(juegosDTO.getTitulo());
	}
}
