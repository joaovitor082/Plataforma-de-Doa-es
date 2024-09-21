package Repositorios;
import java.util.ArrayList;
import Entidades.Doacao;
import Interfaces.InterfaceDoacao;
public class RepositorioDoacao implements InterfaceDoacao {
    private ArrayList<Doacao> doacoes;

//    inicializador
    public RepositorioDoacao() {
        this.doacoes = new ArrayList<Doacao>();
    }

//    metodos
    public void adicionarDoacao(Doacao doacao) {
        this.doacoes.add(doacao);
    }

    public void removerDoacao(Doacao doacao) {
        this.doacoes.remove(doacao);
    }

    public void listarDoacao() {
        if(doacoes.isEmpty()) {
            System.out.println("Nenhuma doação cadastrada");
        }else{
            for (Doacao doacao : doacoes) {
                System.out.println("Nome do Doador: " + doacao.getDoador().getNome() + ", Tipo: " + doacao.getTipoDoacao());
            }
        }
        System.out.println();
    }

    public boolean buscarDoacao(String nome) {
        for (Doacao doacao : this.doacoes) {
            if (doacao.getDoador().getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public void alterarDoacao(String nome, Doacao doacao) {
        for (Doacao doacao1 : this.doacoes) {
            if (doacao1.getDoador().getNome().equals(nome)) {
                doacao1 = doacao;
            }
        }
    }
}
