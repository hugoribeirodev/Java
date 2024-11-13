package exercicios;

public class TelefoneCelular {

    private String modelo;
    private String cor;
    private String numero;
    private double preco;
    private boolean temCamera;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isTemCamera() {
        return temCamera;
    }

    public void setTemCamera(boolean temCamera) {
        this.temCamera = temCamera;
    }

    public static void main(String[] args) {

        TelefoneCelular celular = new TelefoneCelular();


        celular.setModelo("Samsung Galaxy S23");
        celular.setCor("Preto");
        celular.setNumero("11987654321");
        celular.setPreco(4500.00);
        celular.setTemCamera(true);

        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Número: " + celular.getNumero());
        System.out.println("Preço: R$ " + celular.getPreco());
        System.out.println("Tem Câmera: " + celular.isTemCamera());
    }
}