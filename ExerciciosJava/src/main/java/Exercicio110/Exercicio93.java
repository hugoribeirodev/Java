package Exercicio110;

import java.util.Scanner;

public class Exercicio93 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();
            if (numero >= 10 && numero <= 50) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo de 10 a 50: " + contador);

        entrada.close();
    }
}

