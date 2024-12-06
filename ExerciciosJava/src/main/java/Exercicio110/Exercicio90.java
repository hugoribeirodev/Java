package Exercicio110;

import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean encontrouZero = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = entrada.nextInt();

            if (numero == 0) {
                encontrouZero = true;
                break;
            }
        }

        if (encontrouZero) {
            System.out.println("Um dos números é igual a zero.");
        } else {
            System.out.println("Nenhum número é igual a zero.");
        }

        entrada.close();
    }
}

