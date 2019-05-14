package com.fabricadescripts;

import java.util.Scanner;

public class Calculadora {

    int num1, num2, res = 0;

    public int adicao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: \n");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: \n");
        num2 = scanner.nextInt();

        res = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + res + "\n");
        return res;
    }

    public int subtracao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: \n");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: \n");
        num2 = scanner.nextInt();

        res = num1 - num2;

        System.out.println(num1 + " - " + num2 + " = " + res + "\n");
        return res;
    }

}
