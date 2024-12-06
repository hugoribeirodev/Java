package Exercicio80;

import java.util.Scanner;

public class Exercicio76 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int soma = 0;

        for (int i = 2; i <= numero; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);

        entrada.close();
    }
}

