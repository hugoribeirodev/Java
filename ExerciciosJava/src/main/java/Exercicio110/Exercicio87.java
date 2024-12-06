package Exercicio110;

import java.util.Scanner;

public class Exercicio87 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contadorPositivos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = entrada.nextInt();
            if (numero > 0) {
                contadorPositivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contadorPositivos);

        entrada.close();
    }
}

