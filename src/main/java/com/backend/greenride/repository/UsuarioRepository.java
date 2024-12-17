package com.backend.greenride.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.backend.greenride.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByNomeContainingIgnoreCase(@Param("nome") String nome);
	public Optional<Usuario> findById(Long id);
}
