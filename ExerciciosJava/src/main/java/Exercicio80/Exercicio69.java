package Exercicio80;

import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();
            soma += numero;
        }

        double media = soma / 5.0;
        System.out.println("A média aritmética é: " + media);

        entrada.close();
    }
}
