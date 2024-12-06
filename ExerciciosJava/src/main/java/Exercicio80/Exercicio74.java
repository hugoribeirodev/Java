package Exercicio80;

import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        int somaIdades = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            nome = entrada.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            idade = entrada.nextInt();
            entrada.nextLine();

            somaIdades += idade;
        }

        double media = somaIdades / 5.0;
        System.out.println("A média das idades é: " + media);

        entrada.close();
    }
}

