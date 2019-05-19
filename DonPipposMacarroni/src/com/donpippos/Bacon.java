package com.donpippos;

public class Bacon extends PratoDecorator {
    public Bacon(Prato umPrato) {
        super(umPrato);
        nome = "Bacon";
        preco = 1.5;
    }
}
