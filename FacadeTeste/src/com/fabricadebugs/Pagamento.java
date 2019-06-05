package com.fabricadebugs;

public class Pagamento {

    public void calcularValorTotal(){
        System.out.println("Valor Total: R$29,90 \n");
    }

    public void carregarPagamento(){
        System.out.println("Selecionar forma de pagamento...\n");
        System.out.println("Dinheiro \n" +
                "Crédito \n" +
                "Débito \n");
    }
}
