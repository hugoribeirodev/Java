package Exercicio60;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int contador = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt();
            soma += numero;
            contador++;
        } while (contador < 5);

        double media = soma / 5.0;
        System.out.println("A média aritmética é: " + media);

        entrada.close();
    }
}

