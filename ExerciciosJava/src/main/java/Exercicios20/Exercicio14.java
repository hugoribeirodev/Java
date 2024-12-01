package Exercicios20;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = entrada.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = entrada.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = entrada.nextInt();

        // Calculando o total de dias de vida
        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você viveu aproximadamente " + totalDias + " dias.");

        entrada.close();
    }
}
