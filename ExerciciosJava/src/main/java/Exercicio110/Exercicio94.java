package Exercicio110;

import java.util.Scanner;

public class Exercicio94 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();
            if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            }
        }

        entrada.close();
    }
}

