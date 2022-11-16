package com.sigmadrian.juegosapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigmadrian.juegosapi.entity.Juegos;

@Repository
public interface JuegosRepository extends JpaRepository<Juegos, Long> {
	public List<Juegos> findByTituloIs(String titulo);
}
