package Exercicio40;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = entrada.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25.0 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30.0 && imc < 34.9) {
            System.out.println("Classificação: Obesidade grau 1");
        } else if (imc >= 35.0 && imc < 39.9) {
            System.out.println("Classificação: Obesidade grau 2");
        } else {
            System.out.println("Classificação: Obesidade grau 3");
        }

        entrada.close();
    }
}
