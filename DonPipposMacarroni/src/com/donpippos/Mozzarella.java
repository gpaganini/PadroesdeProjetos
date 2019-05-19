package com.donpippos;

public class Mozzarella extends PratoDecorator {
    public Mozzarella(Prato umPrato) {
        super(umPrato);
        nome = "Mozzarella";
        preco = 2.00;
    }
}
