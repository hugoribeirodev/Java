package Exercicio60;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = entrada.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.print("Sequência de Fibonacci: ");
        while (primeiro <= limite) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        entrada.close();
    }
}

