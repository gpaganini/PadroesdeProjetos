package com.fabricadebugs;

import java.util.Scanner;

@SuppressWarnings("MagicConstant")
public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Informe a distancia (Km):");
            int dist = input.nextInt();

            System.out.println("Selecione o tipo de entrega:\n");
            System.out.println("[1] Normal" +
                    "\n[2] Expresso" +
                    "\n[3] AirDeliver" +
                    "\n[4] ExpressAtlantic");
            int opcaoEntrega = input.nextInt();

            TipoEntrega tipoEntrega = TipoEntrega.values()[opcaoEntrega - 1];

            Entrega entrega = tipoEntrega.gEntrega();
            double valor = entrega.calcularValor(dist);
            System.out.printf("O valor total do serviço de entrega é de R$%.2f", valor);
        }
    }
}
