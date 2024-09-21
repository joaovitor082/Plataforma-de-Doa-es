package Servicos;

import Entidades.Doacao;
import Entidades.Doador;
import Repositorios.RepositorioDoacao;
import Repositorios.RepositorioDoador;
import Interfaces.InterfaceServicoDoacao;
public class ServicoDoacao implements  InterfaceServicoDoacao{
    private RepositorioDoacao repositorioDoacao;
    private RepositorioDoador repositorioDoador;

//construtor
    public ServicoDoacao() {
        this.repositorioDoacao = new RepositorioDoacao();
        this.repositorioDoador = new RepositorioDoador();
    }

//    metodos
    public void adicionarDoacao(Doacao doacao) {
        repositorioDoacao.adicionarDoacao(doacao);
    }

    public void removerDoacao(Doacao doacao) {
        repositorioDoacao.removerDoacao(doacao);
    }

    public void listarDoacao() {
        repositorioDoacao.listarDoacao();
    }

    public void buscarDoacao(String nome){
        repositorioDoacao.buscarDoacao(nome);
    }

    public void alterarDoacao(String nome, Doacao doacao){
        repositorioDoacao.alterarDoacao(nome, doacao);
    }


    public void adicionarDoador(Doador doador) {
        repositorioDoador.adicionarDoador(doador);
    }

    public void removerDoador(Doador doador) {
        repositorioDoador.removerDoador(doador);
    }

    public void listaDoador() {
        repositorioDoador.listarDoadores();
    }

    public void buscarDoador(String nome){
        repositorioDoador.buscarDoador(nome);
    }

    public void alterarDoador(String nome, Doador doador){
        repositorioDoador.alterarDoador(nome, doador);
    }

}
