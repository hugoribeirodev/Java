package Exercicios20;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do depósito mensal: ");
        double depositoMensal = entrada.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJuros = entrada.nextDouble() / 100;

        double montante = 0;
        for (int i = 1; i <= 12; i++) {
            montante += depositoMensal;
            montante += montante * taxaJuros;
        }

        System.out.println("O montante após 12 meses é: " + montante);

        entrada.close();
    }
}






