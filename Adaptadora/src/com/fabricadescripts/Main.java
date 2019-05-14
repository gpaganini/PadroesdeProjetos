package com.fabricadescripts;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int res = 0;
        String restart;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a operação " +
                "\n 1 [+] " +
                "\n 2 [-] " +
                "\n 3 [*] " +
                "\n 4 [/] " +
                "\n Por favor digite o número da operação\n");

        int whatever = scanner.nextInt();
        int adicao = 1;
        int subtracao = 2;
        int multiplicacao = 3;
        int divisao = 4;

        BinaryAdapter binAdapter = new BinaryAdapter();
        OctalAdapter octaAdapter = new OctalAdapter();
        HexadecimalAdapter hexaAdapter = new HexadecimalAdapter();

        if (whatever == adicao) {
            Calculadora sum = new Calculadora();
            res = sum.adicao();

            binAdapter.Dec2Bin(res);
            octaAdapter.Dec2Octa(res);
            hexaAdapter.Dec2Hex(res);
        } else if (whatever == subtracao) {
            Calculadora sub = new Calculadora();
            res = sub.subtracao();

            binAdapter.Dec2Bin(res);
            octaAdapter.Dec2Octa(res);
            hexaAdapter.Dec2Hex(res);
        } else if (whatever == multiplicacao) {
            Calculadora mult = new Calculadora();
            res = mult.multiplicacao();

            binAdapter.Dec2Bin(res);
            octaAdapter.Dec2Octa(res);
            hexaAdapter.Dec2Hex(res);
        } else if (whatever == divisao) {
            Calculadora div = new Calculadora();
            res = div.divisao();

            binAdapter.Dec2Bin(res);
            octaAdapter.Dec2Octa(res);
            hexaAdapter.Dec2Hex(res);
        } else {
            System.out.println("A113!");
        }

        System.out.println("Calcular novamente? [Y] ou [N] ? \n");
        restart = scanner.next();

        if (restart.equals("y") || restart.equals("Y")) {
            main(args);
        } else {
            System.exit(0);
        }
    }
}
