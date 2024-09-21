package Interfaces;
import Entidades.Doacao;
import java.util.ArrayList;

public interface InterfaceDoacao {
    public void adicionarDoacao(Doacao doacao);
    public void removerDoacao(Doacao doacao);
    public void listarDoacao();
    public boolean buscarDoacao(String nome);
    public void alterarDoacao(String nome, Doacao doacao);
}
