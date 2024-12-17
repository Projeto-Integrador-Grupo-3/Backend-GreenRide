package com.backend.greenride.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.backend.greenride.model.Corrida;
import com.backend.greenride.repository.CorridaRepository;
import com.backend.greenride.service.CorridaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/corridas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CorridaController {

	@Autowired
	private CorridaService corridaService;

	
	@Autowired
	private CorridaRepository corridaRepository;
	
	@GetMapping
	public ResponseEntity<List<Corrida>> getAll() {
		return ResponseEntity.ok(corridaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Corrida> getById(@PathVariable Long id) {
		return corridaRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@GetMapping("/destino/{destino}")
	public ResponseEntity<List<Corrida>> getByTitulo(@PathVariable String destino) {
		return ResponseEntity.ok(corridaRepository.findAllByDestinoContainingIgnoreCase(destino));
	}
	
	@PostMapping("/calcular")
	public ResponseEntity<Corrida> calcularCorrida(@RequestBody Corrida corrida) {


	   Corrida corridaAtualizada = corridaService.processarCorrida(corrida);


	   return ResponseEntity.ok(corridaAtualizada);
	}

	
	@PostMapping
	public ResponseEntity<Corrida> post(@Valid @RequestBody Corrida corrida) {
		return ResponseEntity.status(HttpStatus.CREATED).body(corridaRepository.save(corrida));
	}
	
	@PutMapping
	public ResponseEntity<Corrida> put(@Valid @RequestBody Corrida corrida){
		return corridaRepository.findById(corrida.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.OK)
						.body(corridaRepository.save(corrida)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		Optional<Corrida> corrida = corridaRepository.findById(id);
		
		if(corrida.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		corridaRepository.deleteById(id);
	}
	
	
	
	
}
