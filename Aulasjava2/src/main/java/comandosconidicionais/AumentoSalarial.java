package comandosconidicionais;
import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        int codigoCargo;
        String resultado;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o código do cargo: ");
        codigoCargo = entrada.nextInt();

        switch (codigoCargo) {
            case 1: resultado = "Cargo: Programador Estagiário\n" +
                        "Salário Atual: R$ 1400.00\n" +
                        "Novo Salário (com aumento de 10%): R$ " + (1400 * 1.10);
            break;

            case 2: resultado = "Cargo: Programador Júnior\n" +
                        "Salário Atual: R$ 3000.00\n" +
                        "Novo Salário (com aumento de 12%): R$ " + (3000 * 1.12);
            break;

            case 3: resultado = "Cargo: Programador Pleno\n" +
                        "Salário Atual: R$ 5500.00\n" +
                        "Novo Salário (com aumento de 13%): R$ " + (5500 * 1.13);
            break;

            case 4: resultado = "Cargo: Programador Sênior\n" +
                        "Salário Atual: R$ 8000.00\n" +
                        "Novo Salário (com aumento de 15%): R$ " + (8000 * 1.15);
            break;

            case 5: resultado = "Cargo: Programador Master\n" +
                        "Salário Atual: R$ 12000.00\n" +
                        "Novo Salário (com aumento de 18%): R$ " + (12000 * 1.18);
            break;

            default: resultado = "Código de cargo inválido!";
        }
        System.out.println(resultado);
    }
}

