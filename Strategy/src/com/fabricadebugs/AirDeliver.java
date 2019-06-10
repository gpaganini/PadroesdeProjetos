package com.fabricadebugs;

public class AirDeliver implements Entrega {
    public double calcularValor(int distancia) {
        return distancia * 0.0285 + 20;
    }
}
