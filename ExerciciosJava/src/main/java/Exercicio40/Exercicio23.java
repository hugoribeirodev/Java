package Exercicio40;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome de um mês: ");
        String mes = entrada.nextLine().toLowerCase();

        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println(mes.substring(0, 1).toUpperCase() + mes.substring(1) + " tem 31 dias.");
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                System.out.println(mes.substring(0, 1).toUpperCase() + mes.substring(1) + " tem 30 dias.");
                break;
            case "fevereiro":
                System.out.println("Fevereiro tem 28 ou 29 dias (em anos bissextos).");
                break;
            default:
                System.out.println("Mês inválido. Por favor, insira um mês válido.");
        }

        entrada.close();
    }
}
