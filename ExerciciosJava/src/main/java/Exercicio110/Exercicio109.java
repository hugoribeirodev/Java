package Exercicio110;

import java.util.Scanner;

public class Exercicio109 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean identidade = true;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriz[i][j] != 1) {
                    identidade = false;
                    break;
                } else if (i != j && matriz[i][j] != 0) {
                    identidade = false;
                    break;
                }
            }
        }

        if (identidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }

        entrada.close();
    }
}

