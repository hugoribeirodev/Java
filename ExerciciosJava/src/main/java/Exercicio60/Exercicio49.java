package Exercicio60;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int fatorial = 1;
        int i = numero;

        while (i > 0) {
            fatorial *= i;
            i--;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);

        entrada.close();
    }
}

