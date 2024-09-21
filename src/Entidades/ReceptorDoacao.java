package Entidades;

import Entidades.ENUM.TipoReceptor;
import Interfaces.InterfaceReceptorDoacao;
public class ReceptorDoacao implements InterfaceReceptorDoacao {
    private double valorComida = 0;
    private double valorDinheiro = 0;
    private TipoReceptor tipoReceptor;

//    Construtores
    public ReceptorDoacao() {
    }

    public ReceptorDoacao(double valorComida, double valorDinheiro, TipoReceptor tipoReceptor) {
        this.valorComida = valorComida;
        this.valorDinheiro = valorDinheiro;
        this.tipoReceptor = tipoReceptor;
    }

//    Getters e Setters
    public double getValorComida() {
        return valorComida;
    }

    public void setValorComida(double valorComida) {
        this.valorComida = valorComida;
    }

    public double getValorDinheiro() {
        return valorDinheiro;
    }

    public void setValorDinheiro(double valorDinheiro) {
        this.valorDinheiro = valorDinheiro;
    }

    public TipoReceptor getTipoReceptor() {
        return tipoReceptor;
    }

    public void setTipoReceptor(TipoReceptor tipoReceptor) {
        this.tipoReceptor = tipoReceptor;
    }

//    Metodos
    public void adicionarComida(double valor){
        this.valorComida += valor;
    }

    public void adicionarDinheiro(double valor){
        this.valorDinheiro += valor;
    }

    public void enviarDoacao(double valor, String tipo){
        switch (tipoReceptor){
            case moradorDeRua:
                if (tipo == "dinheiro"){
                    System.out.println("Doação de dinheiro enviada para moradores de rua");
                    adicionarDinheiro(valor);
                } else if (tipo == "comida"){
                    System.out.println("Doação de comida enviada para moradores de rua");
                    adicionarComida(valor);
                }
                break;
            case ongAnimais:
                if (tipo == "dinheiro"){
                    System.out.println("Doação de dinheiro enviada para ONG de animais");
                    adicionarDinheiro(valor);
                } else if (tipo == "comida"){
                    System.out.println("Doação de comida enviada para ONG de animais");
                    adicionarComida(valor);
                }
                break;
        }
    }
}
