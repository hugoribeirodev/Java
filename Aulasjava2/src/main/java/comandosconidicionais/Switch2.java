package comandosconidicionais;
import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        int mes;
        String numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o número do mês: ");
        mes = entrada.nextInt();

        switch (mes){
            case 1: numero = "Janeiro"; break;
            case 2: numero = "Fevereiro"; break;
            case 3: numero = "Março"; break;
            case 4: numero = "Abril"; break;
            case 5: numero = "Maio"; break;
            case 6: numero = "Junho"; break;
            case 7: numero = "Julho"; break;
            case 8: numero = "Agosto"; break;
            case 9: numero = "Setembro"; break;
            case 10: numero = "Outubro"; break;
            case 11: numero = "Novembro"; break;
            case 12: numero = "Dezembro"; break;
            default: numero = "Erro";
        }

        System.out.println(numero);
    }
}
