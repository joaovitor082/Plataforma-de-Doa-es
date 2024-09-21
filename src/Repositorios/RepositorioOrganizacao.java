package Repositorios;

import Entidades.Organizacao;
import java.util.ArrayList;
import Interfaces.InterfaceOrganizacao;

public class RepositorioOrganizacao implements InterfaceOrganizacao{
    private ArrayList<Organizacao> organizacoes;

//    inicializador
    public RepositorioOrganizacao() {
        this.organizacoes = new ArrayList<Organizacao>();
    }

//    metodos
    public void adicionarOrganizador(Organizacao organizacao) {
        this.organizacoes.add(organizacao);
    }

    public void removerOrganizadores(Organizacao organizacao) {
        this.organizacoes.remove(organizacao);
    }

    public void listarOrganizadores() {
        if (organizacoes.isEmpty()) {
            System.out.println("Nenhuma organizador cadastrado");
        } else {
            for (Organizacao organizacao : organizacoes) {
                System.out.println("Nome do Organizador: " + organizacao.getNome() + ", CNPJ: " + organizacao.getCnpj() + ", Endereço: " + organizacao.getEndereco() + ", Telefone: " + organizacao.getTelefone() + ", Email: " + organizacao.getEmail());
            }
        }
        System.out.println();
    }

    public Organizacao buscar(String nome) {
        for(Organizacao organizacao : this.organizacoes) {
            if(organizacao.getNome().equals(nome)) {
                System.out.println(organizacao);
                return organizacao;
            }
        }
        return null;
    }

    public void alterarOrganizador(String nome, Organizacao organizacao) {
        for (Organizacao organizacao1 : this.organizacoes) {
            if (organizacao1.getNome().equals(nome)) {
                organizacao1 = organizacao;
            }
        }
    }
}
