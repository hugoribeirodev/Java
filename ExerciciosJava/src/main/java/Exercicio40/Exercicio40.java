package Exercicio40;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

        entrada.close();
    }
}
