package comandosconidicionais;

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        int menor;

        if (numero1 <= numero2 && numero1 <= numero3) {
            menor = numero1;
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }

        System.out.println("O menor número é: " + menor);

        entrada.close();
    }
}
