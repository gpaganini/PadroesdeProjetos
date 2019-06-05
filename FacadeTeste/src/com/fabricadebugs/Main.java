package com.fabricadebugs;

public class Main {

    public static void main(String[] args) {
        System.out.println("Carregando DonPippo's Pedido");
        PedidoFacade facade = new PedidoFacade();
        facade.inicializarPedido();
        facade.finalizarPedido();
    }

}
