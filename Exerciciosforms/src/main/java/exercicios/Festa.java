package exercicios;

public class Festa {

    private String tema;
    private int numeroDeConvidados;
    private String data;
    private float orcamento;
    private boolean decoracaoEspecial;


    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNumeroDeConvidados() {
        return numeroDeConvidados;
    }

    public void setNumeroDeConvidados(int numeroDeConvidados) {
        this.numeroDeConvidados = numeroDeConvidados;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(float orcamento) {
        this.orcamento = orcamento;
    }

    public boolean isDecoracaoEspecial() {
        return decoracaoEspecial;
    }

    public void setDecoracaoEspecial(boolean decoracaoEspecial) {
        this.decoracaoEspecial = decoracaoEspecial;
    }

    public void exibirDetalhes() {
        System.out.println("Tema da festa: " + getTema());
        System.out.println("Número de convidados: " + getNumeroDeConvidados());
        System.out.println("Data da festa: " + getData());
        System.out.println("Orçamento: R$ " + getOrcamento());
        System.out.println("Decoração especial: " + (isDecoracaoEspecial() ? "Sim" : "Não"));
    }

    public static void main(String[] args) {

        Festa festaAniversario = new Festa();


        festaAniversario.setTema("Festa de Aniversário");
        festaAniversario.setNumeroDeConvidados(30);
        festaAniversario.setData("01/01/2025");
        festaAniversario.setOrcamento(5000.75f);
        festaAniversario.setDecoracaoEspecial(true);


        festaAniversario.exibirDetalhes();
    }
}