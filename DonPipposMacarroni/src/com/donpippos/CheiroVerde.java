package com.donpippos;

public class CheiroVerde extends PratoDecorator {
    public CheiroVerde(Prato umPrato) {
        super(umPrato);
        nome = "Cheiro Verde";
        preco = 0.50;
    }
}
