package comandosconidicionais;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        float peso = entrada.nextFloat();

        System.out.print("Digite sua altura (em metros): ");
        float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Classificação: Peso ideal (parabéns)");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Classificação: Obesidade grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade grau III (mórbida)");
        }
    }
}
