package comandosconidicionais;
import java.util.Scanner;

public class IdadeVotos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a sua idade: ");
        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Não vota");
        } else if (idade >= 18 && idade <= 69) {
            System.out.println("Voto obrigatório");
        } else {
            System.out.println("Voto opcional");
        }
    }
}