package com.donpippos;

public class TomateSeco extends PratoDecorator {
    public TomateSeco(Prato umPrato) {
        super(umPrato);
        nome = "Tomate Seco";
        preco = 2.00;
    }
}
