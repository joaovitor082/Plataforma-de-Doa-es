package Interfaces;
import Entidades.Doacao;
import Entidades.Doador;
public interface InterfaceServicoDoacao {
    public void adicionarDoacao(Doacao doacao);
    public void removerDoacao(Doacao doacao);
    public void listarDoacao();
    public void buscarDoacao(String nome);
    public void alterarDoacao(String nome, Doacao doacao);

    public void adicionarDoador(Doador doador);
    public void removerDoador(Doador doador);
    public void listaDoador();
    public void buscarDoador(String nome);
    public void alterarDoador(String nome, Doador doador);
}
