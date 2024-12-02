package Exercicio40;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas pessoas serão analisadas? ");
        int quantidade = entrada.nextInt();

        int menoresDeIdade = 0;
        int maioresDeIdade = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();

            if (idade < 18) {
                menoresDeIdade++;
            } else {
                maioresDeIdade++;
            }
        }

        System.out.println("Quantidade de menores de idade: " + menoresDeIdade);
        System.out.println("Quantidade de maiores de idade: " + maioresDeIdade);

        entrada.close();
    }
}