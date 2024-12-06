package Exercicio60;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            boolean ehPrimo = true;
            int divisor = 2;

            while (divisor <= numero / 2) {
                if (numero % divisor == 0) {
                    ehPrimo = false;
                    break;
                }
                divisor++;
            }

            if (ehPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }

        entrada.close();
    }
}

