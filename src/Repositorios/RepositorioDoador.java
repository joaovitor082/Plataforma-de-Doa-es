package Repositorios;

import Entidades.Doador;
import java.util.ArrayList;
import Interfaces.InterfaceDoador;
public class RepositorioDoador implements InterfaceDoador {
    private ArrayList<Doador> doadores;

//    inicializador
    public RepositorioDoador() {
        this.doadores = new ArrayList<>();
    }

//    metodos
    public void adicionarDoador(Doador doador) {
        this.doadores.add(doador);
    }

    public void removerDoador(Doador doador) {
        this.doadores.remove(doador);
    }

    public void listarDoadores() {
        if(doadores.isEmpty()){
            System.out.println("Nenhum doador cadastrado");
        }else{
            for (Doador doador : doadores) {
                System.out.println("Nome: " + doador.getNome() + ", CPF: " + doador.getCpf() + ", Telefone: " + doador.getTelefone() + ", Endereço: " + doador.getEndereco() + ", Email: " + doador.getEmail());
            }
        }
    }

    public boolean buscarDoador(String cpf) {
        for (Doador doador : this.doadores) {
            if (doador.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void alterarDoador(String cpf, Doador doador) {
        for (Doador doador1 : this.doadores) {
            if (doador1.getCpf().equals(cpf)) {
                doador1 = doador;
            }
        }
    }

}
