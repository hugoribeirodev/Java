package Exercicio40;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = entrada.nextDouble();

        double bonus = (salario > 2000) ? salario * 0.10 : salario * 0.05;

        System.out.println("O valor do bônus é: R$ " + bonus);

        entrada.close();
    }
}
