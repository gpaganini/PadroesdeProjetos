package com.fabricadebugs;

public class ExpressAtlantic implements Entrega {
    public double calcularValor(int distancia) {
        return distancia * 0.0025 + 7.89;
    }
}
