package Exercicio60;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        int somaIdades = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            nome = entrada.next();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade: ");
            idade = entrada.nextInt();

            somaIdades += idade;
            contador++;
        }

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        entrada.close();
    }
}

