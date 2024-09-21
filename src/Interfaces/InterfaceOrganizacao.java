package Interfaces;

import java.util.ArrayList;
import Entidades.Organizacao;
public interface InterfaceOrganizacao {
    public void adicionarOrganizador(Organizacao organizacao);
    public void removerOrganizadores(Organizacao organizacao);
    public void listarOrganizadores();
    public Organizacao buscar(String nome);
    public void alterarOrganizador(String nome, Organizacao organizacao);
}
