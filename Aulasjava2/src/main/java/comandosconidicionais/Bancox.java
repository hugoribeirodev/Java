package comandosconidicionais;

import java.util.Scanner;

public class Bancox {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário 1: ");
        float salario1 = entrada.nextFloat();

        System.out.print("Digite o salário 2: ");
        float salario2 = entrada.nextFloat();

        System.out.print("Digite o salário 3: ");
        float salario3 = entrada.nextFloat();

        System.out.print("Digite o salário 4: ");
        float salario4 = entrada.nextFloat();

        System.out.print("Digite o salário 5: ");
        float salario5 = entrada.nextFloat();

        System.out.print("Digite o salário 6: ");
        float salario6 = entrada.nextFloat();

        float somaSalarios = salario1 + salario2 + salario3 + salario4 + salario5 + salario6;
        float saldoMedio = somaSalarios / 6;
        float credito = 0;

        if (saldoMedio >= 0 && saldoMedio <= 500) {
            System.out.println("Nenhum crédito disponível.");
        } else if (saldoMedio >= 501 && saldoMedio <= 1000) {
            credito = saldoMedio * 0.30f;
            System.out.println("Você recebeu 30% de crédito.");
        } else if (saldoMedio >= 1001 && saldoMedio <= 3000) {
            credito = saldoMedio * 0.40f;
            System.out.println("Você recebeu 40% de crédito.");
        } else if (saldoMedio > 3001) {
            credito = saldoMedio * 0.50f;
            System.out.println("Você recebeu 50% de crédito.");
        }

        System.out.printf("Seu saldo médio foi: R$ %.2f\n", saldoMedio);
        if (credito > 0) {
            System.out.printf("O valor do seu crédito é: R$ %.2f\n", credito);
        }

        entrada.close();
    }
}
