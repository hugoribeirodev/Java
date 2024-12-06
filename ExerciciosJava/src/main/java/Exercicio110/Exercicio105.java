package Exercicio110;

import java.util.Scanner;

public class Exercicio105 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        for (int j = 0; j < 4; j++) {
            System.out.println("Soma dos elementos da coluna " + (j + 1) + ": " + somaColunas[j]);
        }

        entrada.close();
    }
}

