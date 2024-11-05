public class TesteCaneta {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();

        caneta1.modelo = "Esferográfica";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 90;
        //caneta1.tampada = true;

        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.estado();

        System.out.println("-------------------------------------------------");

        Caneta caneta2 = new Caneta();

        caneta2.modelo = "Esferográfica";
        caneta2.cor = "Azul";
        caneta2.ponta = 0.5f;
        caneta2.carga = 90;
        //caneta1.tampada = true;

        caneta2.destampar();
        caneta2.rabiscar();
        caneta2.estado();

    }

}
