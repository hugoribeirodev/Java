package Exercicio80;

import java.util.Scanner;

public class Exercicio79 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        while (numero > 0) {
            int digito = numero % 10;
            System.out.println(digito);
            numero /= 10;
        }

        entrada.close();
    }
}

