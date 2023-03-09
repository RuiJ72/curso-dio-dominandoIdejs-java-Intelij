package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;
        System.out.println("Digite um valor: ");
        a = scan.nextInt();

        System.out.println("Digite um segundo valor valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Resto: " + subtrair);
        System.out.println("Divisão: " + dividir);
        System.out.println("Multiplicação: " + multiplicar);

    }

    private static int dividir(int a, int b) {
        return a / b;
    }

    private static int multiplicar(int a, int b) {
        return a * b;
    }

    private static int subtrair(int a, int b) {
        return a - b;
    }

    private static int somar(int a, int b) {
        return a + b;
    }

}



