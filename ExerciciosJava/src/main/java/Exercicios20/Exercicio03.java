package Exercicios20;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = entrada.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);

        entrada.close();
    }
}
