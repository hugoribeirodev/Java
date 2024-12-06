package Exercicio80;

import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int fatorial = 1;
        int i = 1;

        do {
            fatorial *= i;
            i++;
        } while (i <= numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        entrada.close();
    }
}

