package Exercicio110;

import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaPositivos = 0;
        int somaNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = entrada.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                somaNegativos += numero;
            }
        }

        System.out.println("Soma dos valores positivos: " + somaPositivos);
        System.out.println("Soma dos valores negativos: " + somaNegativos);

        entrada.close();
    }
}

