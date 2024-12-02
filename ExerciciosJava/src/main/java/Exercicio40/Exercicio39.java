package Exercicio40;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, soma = 0;

        while (i <= 5) {
            System.out.print("Digite o " + i + "º número: ");
            soma += entrada.nextInt();
            i++;
        }

        double media = soma / 5.0;
        System.out.println("A média aritmética é: " + media);

        entrada.close();
    }
}