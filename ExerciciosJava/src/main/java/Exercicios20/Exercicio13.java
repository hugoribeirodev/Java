package Exercicios20;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();

        if (num2 == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else if (num1 % num2 == 0) {
            System.out.println(num1 + " é múltiplo de " + num2);
        } else {
            System.out.println(num1 + " não é múltiplo de " + num2);
        }

        entrada.close();
    }
}
