package Exercicio40;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = entrada.nextInt();

        double media = (num1 + num2 + num3) / 3.0;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}
