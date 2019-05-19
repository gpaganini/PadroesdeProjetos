package com.donpippos;

public class Main {
    public static void main(String[] args) {
	    Prato meuPrato = new Spaghetti();

        System.out.println(meuPrato.getNome() + " = "
                + meuPrato.getPreco());

        meuPrato = new Bacon(meuPrato);
        System.out.println(meuPrato.getNome() + " = "
                + meuPrato.getPreco());

        meuPrato = new Calabresa(meuPrato);
        System.out.println(meuPrato.getNome() + " = "
                + meuPrato.getPreco());

        meuPrato = new Mozzarella(meuPrato);
        System.out.println(meuPrato.getNome() + " = "
                + meuPrato.getPreco());
    }
}
