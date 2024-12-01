package Exercicios20;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = entrada.nextDouble();

        double area = Math.PI * raio * raio;
        double perimetro = 2 * Math.PI * raio;

        System.out.println("Área do círculo: " + area);
        System.out.println("Perímetro do círculo: " + perimetro);

        entrada.close();
    }
}
