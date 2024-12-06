package Exercicio80;

import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        int somaIdades = 0;
        int contador = 0;

        do {
            System.out.print("Digite o nome: ");
            nome = entrada.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade: ");
                idade = entrada.nextInt();
                entrada.nextLine();
                somaIdades += idade;
                contador++;
            }

        } while (!nome.equalsIgnoreCase("fim"));

        if (contador > 0) {
            double media = somaIdades / (double) contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        entrada.close();
    }
}

