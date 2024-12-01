package Exercicios20;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = entrada.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = entrada.nextInt();

        double valorTotal = preco * quantidade;

        if (quantidade > 10) {
            valorTotal -= valorTotal * 0.10;
        }

        System.out.println("O valor total a ser pago é: " + valorTotal);

        entrada.close();
    }
}
