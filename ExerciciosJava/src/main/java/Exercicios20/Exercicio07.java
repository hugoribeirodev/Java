package Exercicios20;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = entrada.nextDouble();

        double comissao = salarioBase * 0.05;
        double salarioLiquido = salarioBase + comissao;

        System.out.println("O salário líquido é: " + salarioLiquido);

        entrada.close();
    }
}
