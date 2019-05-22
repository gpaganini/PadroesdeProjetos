package com.donpippos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int res = 0;
        String restart;

        Scanner io = new Scanner(System.in);
        System.out.println("Escolha a operação " +
                "\n 1 [+] " +
                "\n 2 [-] " +
                "\n 3 [*] " +
                "\n 4 [/] " +
                "\n Por favor digite o número da operação\n");

        int escolha = io.nextInt();

        if (escolha == 1) {
            Prato meuPrato = new Spaghetti();
            System.out.println(meuPrato.getNome() + " = "
                    + meuPrato.getPreco());

            Scanner ingr = new Scanner(System.in);
            System.out.println("ingredientes: ");

            int ing = ingr.nextInt();

            if (ing == 1) {
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
    }
}
