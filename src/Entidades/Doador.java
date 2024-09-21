package Entidades;

public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;

//    construtores
    public Doador() {
    }

    public Doador(String nome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

//    Getters e Setters

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
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
}
