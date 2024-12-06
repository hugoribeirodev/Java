package Exercicio110;

import java.util.Scanner;

public class Exercicio88 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaPares = 0, somaImpares = 0;
        int contadorPares = 0, contadorImpares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
                contadorPares++;
            } else {
                somaImpares += numero;
                contadorImpares++;
            }
        }

        if (contadorPares > 0) {
            System.out.println("Média dos números pares: " + (somaPares / (double) contadorPares));
        } else {
            System.out.println("Não foram informados números pares.");
        }

        if (contadorImpares > 0) {
            System.out.println("Média dos números ímpares: " + (somaImpares / (double) contadorImpares));
        } else {
            System.out.println("Não foram informados números ímpares.");
        }

        entrada.close();
    }
}

