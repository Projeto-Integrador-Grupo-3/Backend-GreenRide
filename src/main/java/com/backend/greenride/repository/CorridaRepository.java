package com.backend.greenride.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.backend.greenride.model.Corrida;

public interface CorridaRepository extends JpaRepository <Corrida, Long>{

	public List<Corrida> findAllByDestinoContainingIgnoreCase(@Param("destino") String destino);
}
