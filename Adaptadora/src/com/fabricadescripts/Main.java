package com.fabricadescripts;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int res = 0;

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

        if (whatever == adicao) {
            Calculadora sum = new Calculadora();
            res = sum.adicao();

            BinaryAdapter binAdapter = new BinaryAdapter();
            binAdapter.Dec2Bin(res);

            /*System.out.println(a + " + " + b + " = " + c);
            System.out.println("Binário: " + Integer.toString(c,2));
            System.out.println("Octal: " + Integer.toString(c, 8));
            System.out.println("Hexadecimal: " + Integer.toString(c, 16));*/
        } else if (whatever == subtracao) {
            Calculadora sub = new Calculadora();
            res = sub.subtracao();

            /*c = a - b;
            System.out.println(a + " - " + b + " = " + c);
            System.out.println("Binário: " + Integer.toString(c,2));
            System.out.println("Octal: " + Integer.toString(c, 8));
            System.out.println("Hexadecimal: " + Integer.toString(c, 16));*/
        } else if (whatever == multiplicacao) {
            /*c = a * b;
            System.out.println(a + " * " + b + " = " + c);
            System.out.println("Binário: " + Integer.toString(c,2));
            System.out.println("Octal: " + Integer.toString(c, 8));
            System.out.println("Hexadecimal: " + Integer.toString(c, 16));*/
        } else if (whatever == divisao) {
            /*c = a / b;
            System.out.println(a + " / " + b + " = " + c);
            System.out.println("Binário: " + Integer.toString(c,2));
            System.out.println("Octal: " + Integer.toString(c, 8));
            System.out.println("Hexadecimal: " + Integer.toString(c, 16));*/
        } else {
            System.out.println("A113!");
        }
    }
}
