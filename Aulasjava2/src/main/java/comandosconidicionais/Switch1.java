package comandosconidicionais;
import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        int farol;
        String mensagem;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com um número");
        farol = entrada.nextInt();

        switch (farol){
            case 1: mensagem="Farol verde! siga";
            break;
            case 2: mensagem="Farol amarelo! diminua a velocidade";
            break;
            case 3: mensagem="Farol vermelho! pare!";
            break;
            default: mensagem="Número inválido";
        }

        System.out.println(mensagem);
    }
}
