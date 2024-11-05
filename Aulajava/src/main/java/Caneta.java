public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar(){
        if(tampada == true){
            System.out.println("Serio?");
        }else {
            System.out.println("Rabisca legal ai");
        }
    }
    void tampar(){
        tampada = true;
    }

    void destampar(){
        tampada = false;
    }

    void estado(){
        System.out.println("Essa caneta é do modelo: " + modelo);
        System.out.println("Esta caneta tem a cor: " + cor);
        System.out.println("Esta caneta tem ponta: " + ponta);
        System.out.println("Esta caneta tem carga em: " + carga);
        System.out.println("Esta caneta tem tampada: " + tampada);
    }
}
