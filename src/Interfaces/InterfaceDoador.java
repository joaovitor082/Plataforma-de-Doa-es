package Interfaces;
import java.util.ArrayList;
import Entidades.Doador;
public interface InterfaceDoador {
    public void adicionarDoador(Doador doador);
    public void removerDoador(Doador doador);
    public void listarDoadores();
    public boolean buscarDoador(String cpf);
    public void alterarDoador(String cpf, Doador doador);
}
