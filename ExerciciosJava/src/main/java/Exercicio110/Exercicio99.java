package Exercicio110;

import java.util.Scanner;

public class Exercicio99 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] somaMatrizes = new int[2][2];

        System.out.println("Digite os valores da primeira matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "] da matriz 1: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Digite os valores da segunda matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "] da matriz 2: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("A soma das duas matrizes é:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(somaMatrizes[i][j] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}

