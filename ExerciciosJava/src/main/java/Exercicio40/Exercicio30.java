package Exercicio40;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = entrada.nextInt();

        double precoPorMaca;

        if (quantidade < 12) {
            precoPorMaca = 0.50;
        } else {
            precoPorMaca = 0.40;
        }

        double total = quantidade * precoPorMaca;

        System.out.println("O valor total a ser pago é: R$ " + total);

        entrada.close();
    }
}