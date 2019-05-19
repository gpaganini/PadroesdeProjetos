package com.donpippos;

public class Calabresa extends PratoDecorator {
    public Calabresa(Prato umPrato) {
        super(umPrato);
        nome = "Calabresa";
        preco = 1.50;
    }
}
