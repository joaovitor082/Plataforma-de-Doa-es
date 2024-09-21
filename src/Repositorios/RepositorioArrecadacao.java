package Repositorios;

import Entidades.Arrecadacao;
import java.util.ArrayList;
public class RepositorioArrecadacao{
    public ArrayList<Arrecadacao> arrecadacoes = new ArrayList<Arrecadacao>();



//    metodos
    public void adicionarArrecadacao(Arrecadacao arrecadacao){
    arrecadacoes.add(arrecadacao);
}

    public void removerArrecadacao(Arrecadacao arrecadacao){
        arrecadacoes.remove(arrecadacao);
    }

    public void listarArrecadacoes(){
        if (arrecadacoes.isEmpty()){
            System.out.println("Não há arrecadações cadastradas");
        }else {
            for (Arrecadacao arrecadacao : arrecadacoes){
                System.out.println("Nome da Campanha: " + arrecadacao.getNomeDaCampanha() + ", Descrição: " + arrecadacao.getDescricaoArrecadacao() + ", Organizador: " + arrecadacao.getOrganizador().getNome());
            }
        }
        System.out.println();
    }

    public boolean buscarArrecadacao(String nome){
        for(Arrecadacao arrecadacao : arrecadacoes){
            if(arrecadacao.getNomeDaCampanha().equals(nome)){
                return true;
            }
        }
        return false;
    }

    public void alterarArrecadacao(String nome, Arrecadacao arrecadacao){
        for(Arrecadacao arrecadacao1 : arrecadacoes){
            if(arrecadacao1.getNomeDaCampanha().equals(nome)){
                arrecadacao1 = arrecadacao;
            }
        }
    }
}
