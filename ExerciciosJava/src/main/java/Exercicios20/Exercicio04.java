package Exercicios20;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota (peso 2): ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota (peso 3): ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota (peso 5): ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

        System.out.println("A média ponderada é: " + media);

        entrada.close();
    }
}
