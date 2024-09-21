package Interfaces;
import Entidades.Organizacao;
import Entidades.Arrecadacao;

public interface InterfaceServicoArrecadacao {
    public void adicionarOrganizacao(Organizacao organizacao);
    public void removerOrganizacao(Organizacao organizacao);
    public Organizacao buscarOrganizacao(String nome);
    public void adicionarArredacao(Arrecadacao arrecadacao);
    public boolean buscarArrecadacao(String nome);
    public void alterarArrecadacao(String nome, Arrecadacao arrecadacao);
    public void listarArrecadacoes();
}
