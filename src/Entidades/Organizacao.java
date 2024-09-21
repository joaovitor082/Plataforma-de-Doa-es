package Entidades;

public class Organizacao{
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;
    private Arrecadacao arrecadacao;

//Construtores
    public Organizacao() {
    }

    public Organizacao(String nome, String cnpj, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public Organizacao(String nome, String cnpj, String endereco, String telefone, String email, Arrecadacao arrecadacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.arrecadacao = arrecadacao;
    }


//    getters
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Arrecadacao getArrecadacao() {
        return arrecadacao;
    }

}
