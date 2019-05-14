package com.fabricadescripts;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, c = 0;

        System.out.println("Digite o primeiro número: \n");
        a = scanner.nextInt();

        System.out.println("Digite o segundo número: \n");
        b = scanner.nextInt();

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
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
            System.out.println("Binário: " + Integer.toString(c,2));
            System.out.println("Octal: " + Integer.toString(c, 8));
            System.out.println("Hexadecimal: " + Integer.toString(c, 16));
        } else if (whatever == subtracao) {
            c = a - b;
            System.out.println(a + " - " + b + " = " + c);
            System.out.println("Binário: " + Integer.toString(c,2));
            System.out.println("Octal: " + Integer.toString(c, 8));
            System.out.println("Hexadecimal: " + Integer.toString(c, 16));
        } else if (whatever == multiplicacao) {
            c = a * b;
            System.out.println(a + " * " + b + " = " + c);
            System.out.println("Binário: " + Integer.toString(c,2));
            System.out.println("Octal: " + Integer.toString(c, 8));
            System.out.println("Hexadecimal: " + Integer.toString(c, 16));
        } else if (whatever == divisao) {
            c = a / b;
            System.out.println(a + " / " + b + " = " + c);
            System.out.println("Binário: " + Integer.toString(c,2));
            System.out.println("Octal: " + Integer.toString(c, 8));
            System.out.println("Hexadecimal: " + Integer.toString(c, 16));
        }
    }
}
