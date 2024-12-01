package Exercicios20;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = entrada.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("A pessoa é criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("A pessoa é adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("A pessoa é adulta.");
        } else if (idade >= 60) {
            System.out.println("A pessoa é idosa.");
        } else {
            System.out.println("Idade inválida.");
        }

        entrada.close();
    }
}