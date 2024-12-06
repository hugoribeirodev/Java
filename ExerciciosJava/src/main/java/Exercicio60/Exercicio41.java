package Exercicio60;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            int divisor = 1;

            System.out.println("Divisores de " + numero + ":");
            while (divisor <= numero) {
                if (numero % divisor == 0) {
                    System.out.println(divisor);
                }
                divisor++;
            }
        }

        entrada.close();
    }
}

