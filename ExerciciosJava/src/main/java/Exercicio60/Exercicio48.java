package Exercicio60;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int numeroAbsoluto = Math.abs(numero);
        String numeroComoString = Integer.toString(numeroAbsoluto);

        int i = 0;
        while (i < numeroComoString.length()) {
            System.out.println(numeroComoString.charAt(i));
            i++;
        }

        entrada.close();
    }
}

