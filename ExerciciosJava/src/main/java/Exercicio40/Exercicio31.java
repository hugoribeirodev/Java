package Exercicio40;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = entrada.nextDouble();

        System.out.print("Digite o valor do salário do funcionário: ");
        double salarioFuncionario = entrada.nextDouble();

        double quantosSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe " + quantosSalariosMinimos + " salários mínimos.");

        entrada.close();
    }
}
