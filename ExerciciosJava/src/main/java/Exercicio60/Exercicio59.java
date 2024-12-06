package Exercicio60;

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 1;

        do {
            System.out.print("Digite o nome da pessoa " + contador + ": ");
            String nome = entrada.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = entrada.nextInt();
            entrada.nextLine(); // Para limpar o buffer do scanner

            somaIdades += idade;
            contador++;
        } while (contador <= 5);

        double media = somaIdades / 5.0;
        System.out.println("A média das idades é: " + media);

        entrada.close();
    }
}

