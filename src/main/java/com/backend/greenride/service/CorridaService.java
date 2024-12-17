package com.backend.greenride.service;


import com.backend.greenride.model.Corrida;
import org.springframework.stereotype.Service;


@Service
public class CorridaService {


   private static final Double velocidadeMedia = 60.0;
   private static final Double valorPorKm = 10.0;




   // Calcula o tempo de viagem
   public Double calcularTempoDeViagem(Double distanciaKm) {
       if (distanciaKm == null || distanciaKm <= 0)
           throw new IllegalArgumentException("Distância inválida!");


       return distanciaKm / velocidadeMedia;
   }


   // Calcula o valor da corrida
   public Double calcularValorDaCorrida(Double distanciaKm) {
       if (distanciaKm == null || distanciaKm <= 0)
           throw new IllegalArgumentException("Distância inválida!");


       return distanciaKm * valorPorKm;
   }


   // Atualiza o objeto Corrida com tempo e valor
   public Corrida processarCorrida(Corrida corrida) {
       Double distancia = corrida.getDistanciaKm();


       corrida.setTempo(calcularTempoDeViagem(distancia));
       corrida.setValor(calcularValorDaCorrida(distancia));


       return corrida;
   }
}
