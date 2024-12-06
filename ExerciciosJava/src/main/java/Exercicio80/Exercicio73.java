package Exercicio80;

import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = entrada.nextInt();

        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci: ");
        while (a <= limite) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }

        entrada.close();
    }
}

