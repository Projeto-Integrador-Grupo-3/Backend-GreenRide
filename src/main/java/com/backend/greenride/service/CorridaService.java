package com.backend.greenride.service;

import com.backend.greenride.model.Corrida;
import com.backend.greenride.repository.CorridaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorridaService {

    private static final Double velocidadeMedia = 60.0; 
    private static final Double valorPorKm = 10.0;

    @Autowired
    private CorridaRepository corridaRepository;


    private Double calcularTempoDeViagem(Double distanciaKm) {
        if (distanciaKm == null || distanciaKm <= 0)
            throw new IllegalArgumentException("Distância inválida!");

        return distanciaKm / velocidadeMedia;
    }

    private Double calcularValorDaCorrida(Double distanciaKm) {
        if (distanciaKm == null  || distanciaKm <= 0)
            throw new IllegalArgumentException("Distância inválida!");

        return distanciaKm * valorPorKm;
    }

    public Corrida processarCorridaPorId(Long id) {

        Corrida corrida = corridaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Corrida não encontrada!"));
        corrida.setTempo(calcularTempoDeViagem(corrida.getDistanciaKm()));
        corrida.setValor(calcularValorDaCorrida(corrida.getDistanciaKm()));


        return corridaRepository.save(corrida);
    }
}