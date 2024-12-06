package Exercicio60;

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci até " + numero + ": ");

        if (numero >= 0) {
            System.out.print(a + " ");
        }

        if (numero >= 1) {
            System.out.print(b + " ");
        }

        do {
            int proximo = a + b;
            if (proximo <= numero) {
                System.out.print(proximo + " ");
            }
            a = b;
            b = proximo;
        } while (b <= numero);

        entrada.close();
    }
}

