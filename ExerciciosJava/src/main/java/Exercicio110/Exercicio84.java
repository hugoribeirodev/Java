package Exercicio110;

import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contadorPares = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contadorPares);

        entrada.close();
    }
}

