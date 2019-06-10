package com.fabricadebugs.ServicoDeEntrega.Entregas;

import com.fabricadebugs.ServicoDeEntrega.Entrega;

public class AirDeliver implements Entrega {
    public double calcularValor(int distancia) {
        return distancia * 0.0285 + 20;
    }
}
