package Exercicio80;

import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int soma = 0;
        int i = 2;

        do {
            soma += i;
            i += 2;
        } while (i <= numero);

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);

        entrada.close();
    }
}
