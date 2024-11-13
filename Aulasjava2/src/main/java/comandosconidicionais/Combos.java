package comandosconidicionais;
import java.util.Scanner;

public class Combos {
    public static void main(String[] args) {
        int combo;
        String numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero do combo: ");
        combo = entrada.nextInt();

        switch (combo){
            case 1:
                numero = "Combo 1 - Big Mac\nItens:\n" +
                        "- Sanduíche Big Mac\n" +
                        "- Batata frita média\n" +
                        "- Refrigerante médio";
                break;

            case 2:
                numero = "Combo 2 - Cheddar McMelt\nItens:\n" +
                        "- Sanduíche Cheddar McMelt\n" +
                        "- Batata frita grande\n" +
                        "- Refrigerante grande";
                break;

            case 3:
                numero = "Combo 3 - Whopper\nItens:\n" +
                        "- Sanduíche Whopper\n" +
                        "- Batata frita grande\n" +
                        "- Refrigerante médio";
                break;

            case 4:
                numero = "Combo 4 - Chicken Jr.\nItens:\n" +
                        "- Sanduíche Chicken Jr.\n" +
                        "- Batata frita pequena\n" +
                        "- Refrigerante pequeno";
                break;

            case 5:
                numero = "Combo 5 - King Costela\nItens:\n" +
                        "- Sanduíche no pão de brioche\n" +
                        "- Hambúrguer de carne bovina grelhada\n" +
                        "- 2 fatias de queijo sabor cheddar\n" +
                        "- Carne de costela bovina desfiada\n" +
                        "- Chutney de cebola roxa\n" +
                        "- Cebola crispy\n" +
                        "- 3 anéis de onion rings\n" +
                        "- Maionese de alho";
                break;

            default: numero = "Combo inválido!";
        }
        System.out.println(numero);
    }
}
