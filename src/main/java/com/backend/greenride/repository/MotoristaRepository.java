package com.backend.greenride.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.backend.greenride.model.Motorista;

public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
	public List<Motorista> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
