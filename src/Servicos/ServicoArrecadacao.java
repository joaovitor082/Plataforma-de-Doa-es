package Servicos;

import Entidades.Organizacao;
import Entidades.Arrecadacao;
import Repositorios.RepositorioArrecadacao;
import Repositorios.RepositorioOrganizacao;
import Interfaces.InterfaceServicoArrecadacao;

public class ServicoArrecadacao implements InterfaceServicoArrecadacao {
    private RepositorioOrganizacao repositorioOrganizacao;
    private RepositorioArrecadacao repositorioArrecadacao;

//    construtor
    public ServicoArrecadacao() {
        this.repositorioOrganizacao = new RepositorioOrganizacao();
        this.repositorioArrecadacao = new RepositorioArrecadacao();
    }

//    metodos
    public void adicionarOrganizacao(Organizacao organizacao) {
        repositorioOrganizacao.adicionarOrganizador(organizacao);
    }

    public void removerOrganizacao(Organizacao organizacao) {
        repositorioOrganizacao.removerOrganizadores(organizacao);
    }

    public Organizacao buscarOrganizacao(String nome) {
        return repositorioOrganizacao.buscar(nome);
    }

    public void adicionarArredacao(Arrecadacao arrecadacao){
        repositorioArrecadacao.adicionarArrecadacao(arrecadacao);
    }

    public boolean buscarArrecadacao(String nome){
        return repositorioArrecadacao.buscarArrecadacao(nome);
    }

    public void alterarArrecadacao(String nome, Arrecadacao arrecadacao){
        repositorioArrecadacao.alterarArrecadacao(nome, arrecadacao);
    }

    public void listarArrecadacoes(){
        repositorioArrecadacao.listarArrecadacoes();
    }
}
