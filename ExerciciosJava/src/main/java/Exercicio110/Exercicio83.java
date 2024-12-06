package Exercicio110;

import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite o " + i + "º número: ");
            soma += entrada.nextInt();
        }

        double media = soma / 7.0;
        System.out.println("A média aritmética dos números é: " + media);

        entrada.close();
    }
}

