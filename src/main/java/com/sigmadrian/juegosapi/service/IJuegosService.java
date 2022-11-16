package com.sigmadrian.juegosapi.service;

import java.util.List;

import com.sigmadrian.juegosapi.entity.Juegos;

public interface IJuegosService {

		List<Juegos> buscarTodos();
		List<Juegos> buscarTitulo(String titulo);
}
