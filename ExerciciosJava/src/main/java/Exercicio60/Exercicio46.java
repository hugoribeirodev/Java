package Exercicio60;

import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();

        int soma = 0;
        int contador = 1;

        while (contador <= numero) {
            if (contador % 2 == 0) {
                soma += contador;
            }
            contador++;
        }

        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);

        entrada.close();
    }
}

