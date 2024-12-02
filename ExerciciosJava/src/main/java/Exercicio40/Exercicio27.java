package Exercicio40;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
        char sexo = entrada.next().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            if (idade >= 65) {
                System.out.println("O homem pode se aposentar.");
            } else {
                System.out.println("O homem não pode se aposentar.");
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (idade >= 60) {
                System.out.println("A mulher pode se aposentar.");
            } else {
                System.out.println("A mulher não pode se aposentar.");
            }
        } else {
            System.out.println("Sexo inválido. Por favor, digite 'M' ou 'F'.");
        }

        entrada.close();
    }
}
