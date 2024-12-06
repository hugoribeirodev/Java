package Exercicio60;

import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();

        int i = 1;
        System.out.println("Divisores de " + numero + ":");
        do {
            if (numero % i == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);

        entrada.close();
    }
}

