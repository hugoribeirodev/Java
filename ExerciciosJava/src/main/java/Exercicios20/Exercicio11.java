package Exercicios20;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número real: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número real: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite o terceiro número real: ");
        double num3 = entrada.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("A média aritmética é: " + media);

        entrada.close();
    }
}
