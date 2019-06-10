package com.fabricadebugs;

public class Normal implements Entrega {
    public double calcularValor(int distancia) {
        return distancia * 0.0125 + 15;
    }
}
