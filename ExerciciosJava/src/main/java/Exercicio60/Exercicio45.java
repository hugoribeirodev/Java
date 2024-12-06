package Exercicio60;

public class Exercicio45 {
    public static void main(String[] args) {
        int primeiro = 0, segundo = 1, contador = 1;

        System.out.print("Primeiros 20 números da sequência de Fibonacci: ");
        while (contador <= 20) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            contador++;
        }
    }
}

