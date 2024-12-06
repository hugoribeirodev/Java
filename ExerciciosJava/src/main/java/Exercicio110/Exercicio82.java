package Exercicio110;

import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            soma += entrada.nextInt();
        }

        System.out.println("A soma dos números é: " + soma);

        entrada.close();
    }
}

