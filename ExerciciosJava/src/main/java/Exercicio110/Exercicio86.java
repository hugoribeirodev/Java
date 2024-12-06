package Exercicio110;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio86 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        entrada.close();
    }
}

