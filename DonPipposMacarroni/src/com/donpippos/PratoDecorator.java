package com.donpippos;

public class PratoDecorator extends Prato {
    Prato prato;

    public PratoDecorator(Prato umPrato) {
        prato = umPrato;
    }

    @Override
    public String getNome() {
        return prato.getNome() + " + " + nome;
    }

    public double getPreco() {
        return prato.getPreco() + preco;
    }
}
