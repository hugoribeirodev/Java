package Exercicio60;

import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        int i = 2;
        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            do {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
                i++;
            } while (i <= Math.sqrt(numero));
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        entrada.close();
    }
}

