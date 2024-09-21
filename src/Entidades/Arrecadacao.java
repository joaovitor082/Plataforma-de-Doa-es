package Entidades;

public class Arrecadacao{
    private String nomeDaCampanha;
    private String tipoArrecadacao;
    private String descricaoArrecadacao;

    private Organizacao organizador;

//    Construtores
    public Arrecadacao() {
    }

    public Arrecadacao(String nomeDaCampanha, String tipoArrecadacao, String descricaoArrecadacao, Organizacao organizador) {
        this.nomeDaCampanha = nomeDaCampanha;
        this.tipoArrecadacao = tipoArrecadacao;
        this.descricaoArrecadacao = descricaoArrecadacao;
        this.organizador = organizador;
    }


//    Getters
    public String getNomeDaCampanha() {
        return nomeDaCampanha;
    }

    public String getTipoArrecadacao() {
        return tipoArrecadacao;
    }

    public String getDescricaoArrecadacao() {
        return descricaoArrecadacao;
    }

    public Organizacao getOrganizador() {
        return organizador;
    }


}
