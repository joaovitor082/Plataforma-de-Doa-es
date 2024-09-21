package Entidades;

public class Doacao{
    private String tipoDoacao;
    private String descricaoDoacao;
    private double quantidadeDoacao;
    private Doador doador;

//    construtores
    public Doacao() {
    }

    public Doacao(String tipoDoacao, String descricaoDoacao, double quantidadeDoacao, Doador doador) {
        this.tipoDoacao = tipoDoacao;
        this.descricaoDoacao = descricaoDoacao;
        this.quantidadeDoacao = quantidadeDoacao;
        this.doador = doador;
    }


//    Getters e Setters
    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public String getDescricaoDoacao() {
        return descricaoDoacao;
    }

    public double getQuantidadeDoacao() {
        return quantidadeDoacao;
    }

    public Doador getDoador() {
        return doador;
    }

}

