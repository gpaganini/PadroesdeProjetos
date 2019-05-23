package com.donpippos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Prato meuPrato = new Penne();
        System.out.println(meuPrato.getNome() + " = "
                + meuPrato.getPreco());

        meuPrato = new Calabresa(meuPrato);
        System.out.println(meuPrato.getNome() + " = "
                + meuPrato.getPreco());

        meuPrato = new Mozzarella(meuPrato);
        System.out.println(meuPrato.getNome() + " = " + meuPrato.getPreco());

        System.out.println(meuPrato instanceof Calabresa);
    }
}

