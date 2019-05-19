package com.donpippos;

public class Frango extends PratoDecorator {
    public Frango(Prato umPrato) {
        super(umPrato);
        nome = "Frango";
        preco = 2.50;
    }
}
