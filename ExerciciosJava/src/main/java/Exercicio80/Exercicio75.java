package Exercicio80;

public class Exercicio75 {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;

        System.out.print("Sequência de Fibonacci: ");

        for (int i = 1; i <= 20; i++) {
            System.out.print(n1 + " ");
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }
    }
}

