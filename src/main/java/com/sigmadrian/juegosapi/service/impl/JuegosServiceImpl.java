package com.sigmadrian.juegosapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigmadrian.juegosapi.entity.Juegos;
import com.sigmadrian.juegosapi.repository.JuegosRepository;
import com.sigmadrian.juegosapi.service.IJuegosService;

@Service
public class JuegosServiceImpl implements IJuegosService{

	@Autowired
	private JuegosRepository juegoRepository;
	
	@Override
	public List<Juegos> buscarTodos() {
		return juegoRepository.findAll();
	}

	@Override
	public List<Juegos> buscarTitulo(String titulo) {
		return juegoRepository.findByTituloIs(titulo);
	}
	
	

}
