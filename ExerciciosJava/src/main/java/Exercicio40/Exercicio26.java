package Exercicio40;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Códigos e preços dos produtos:");
        System.out.println("1 - R$ 10,00");
        System.out.println("2 - R$ 15,00");
        System.out.println("3 - R$ 20,00");
        System.out.println("4 - R$ 25,00");

        System.out.print("Digite o código do produto: ");
        int codigo = entrada.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = entrada.nextInt();

        double preco = 0;

        switch (codigo) {
            case 1:
                preco = 10.00;
                break;
            case 2:
                preco = 15.00;
                break;
            case 3:
                preco = 20.00;
                break;
            case 4:
                preco = 25.00;
                break;
            default:
                System.out.println("Código inválido!");
                entrada.close();
                return;
        }

        double total = preco * quantidade;
        System.out.println("O valor total a ser pago é: R$ " + total);

        entrada.close();
    }
}
