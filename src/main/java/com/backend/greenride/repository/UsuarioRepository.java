package com.backend.greenride.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.backend.greenride.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	public Optional<Usuario> findByUsuario(String usuario);
	public Optional<Usuario> findById(Long id);
}
