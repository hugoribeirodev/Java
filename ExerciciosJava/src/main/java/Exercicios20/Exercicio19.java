package Exercicios20;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("O aluno foi aprovado com média: " + media);
        } else {
            System.out.println("O aluno foi reprovado com média: " + media);
        }

        entrada.close();
    }
}
