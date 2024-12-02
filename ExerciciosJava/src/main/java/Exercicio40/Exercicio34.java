package Exercicio40;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = entrada.nextInt();

        if (idade >= 18 && idade <= 70) {
            System.out.println("O voto é obrigatório.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("A pessoa não pode votar.");
        }

        entrada.close();
    }
}
