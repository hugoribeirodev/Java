package Exercicio110;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio92 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números em ordem decrescente:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}

