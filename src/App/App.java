package App;

import Entidades.Doacao;
import Entidades.Doador;
import Entidades.Organizacao;
import Entidades.Arrecadacao;
import Entidades.ReceptorDoacao;
import Entidades.ENUM.TipoReceptor;
import Servicos.ServicoArrecadacao;
import Servicos.ServicoDoacao;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ServicoDoacao servicoDoacao = new ServicoDoacao();
        ServicoArrecadacao servicoArrecadacao = new ServicoArrecadacao();
        ReceptorDoacao moradoresDeRua = new ReceptorDoacao(0, 0, TipoReceptor.moradorDeRua);
        ReceptorDoacao ongAnimais = new ReceptorDoacao(0, 0, TipoReceptor.ongAnimais);

        boolean sair = false;

        do {
            try {
                System.out.println("Navegação: 1- Doar, 2- Criar Arrecadação, 3- Listar Campanhas, 4- Sair");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.println("CPF: ");
                        String cpf = scanner.nextLine();
                        System.out.println("Endereço: ");
                        String endereco = scanner.nextLine();
                        System.out.println("Telefone: ");
                        String telefone = scanner.nextLine();
                        System.out.println("Email: ");
                        String email = scanner.nextLine();

                        Doador doador = new Doador(nome, cpf, endereco, telefone, email);
                        servicoDoacao.adicionarDoador(doador);

                        boolean sairDoacao = false;
                        do {
                            System.out.println("Tipo da doação: 1- Dinheiro, 2- Comida");
                            int tipoDoado = scanner.nextInt();
                            scanner.nextLine();
                            String tipo;
                            if (tipoDoado == 1) {
                                System.out.println("Valor da doação: ");
                                double valor = scanner.nextDouble();
                                scanner.nextLine();

                                Doacao doacao = new Doacao("Dinheiro", "Doação em dinheiro", valor, doador);
                                servicoDoacao.adicionarDoacao(doacao);

                                boolean sup = false;

                                do {
                                    System.out.println("Doação destinada para: 1- Ong Moradores de rua, 2- Ong de animais");
                                    int tipoDoacao = scanner.nextInt();
                                    if (tipoDoacao == 1) {
                                        tipo = "dinheiro";
                                        System.out.println("Doação destinada para moradores de rua");
                                        moradoresDeRua.adicionarDinheiro(valor);
                                        System.out.println("Valor em dinheiro na conta: " + moradoresDeRua.getValorDinheiro());
                                        sup = true;
                                    } else if (tipoDoacao == 2) {
                                        tipo = "dinheiro";
                                        System.out.println("Doação destinada para Ong de animais");
                                        ongAnimais.adicionarDinheiro(valor);
                                        System.out.println("Valor em dinheiro na conta: " + ongAnimais.getValorDinheiro());
                                        sup = true;
                                    } else {
                                        System.out.println("Opção inválida, tente novamente.");
                                    }
                                } while (!sup);
                                sairDoacao = true;

                            } else if (tipoDoado == 2) {
                                System.out.println("Valor da doação: ");
                                double valor = scanner.nextDouble();
                                scanner.nextLine();

                                Doacao doacao = new Doacao("Comida", "Doação em Comida", valor, doador);
                                servicoDoacao.adicionarDoacao(doacao);

                                boolean sup = false;
                                do {
                                    System.out.println("Doação destinada para: 1- Moradores de rua, 2- Ong de animais");
                                    int tipoDoacao = scanner.nextInt();
                                    if (tipoDoacao == 1) {
                                        tipo = "comida";
                                        System.out.println("Doação destinada para moradores de rua");
                                        moradoresDeRua.adicionarComida(valor);
                                        System.out.println("Valor em comida na conta: " + moradoresDeRua.getValorComida());
                                        sup = true;
                                    } else if (tipoDoacao == 2) {
                                        tipo = "comida";
                                        System.out.println("Doação destinada para ONG de animais");
                                        ongAnimais.adicionarComida(valor);
                                        System.out.println("Valor em comida na conta: " + ongAnimais.getValorComida());
                                        sup = true;
                                    } else {
                                        System.out.println("Opção inválida, tente novamente.");
                                    }
                                } while (!sup);

                                sairDoacao = true;

                            } else {
                                System.out.println("Opção inválida, tente novamente.");
                            }
                        } while (!sairDoacao);
                        break;
                    case 2:
                        System.out.println("Nome do Organizador: ");
                        String nomeOrganizador = scanner.nextLine();
                        System.out.println("CNPJ: ");
                        String cnpj = scanner.nextLine();
                        System.out.println("Endereço: ");
                        String enderecoOrganizador = scanner.nextLine();
                        System.out.println("Telefone: ");
                        String telefoneOrganizador = scanner.nextLine();
                        System.out.println("Email: ");
                        String emailOrganizador = scanner.nextLine();

                        Organizacao organizador = new Organizacao(nomeOrganizador, cnpj, enderecoOrganizador, telefoneOrganizador, emailOrganizador);
                        servicoArrecadacao.adicionarOrganizacao(organizador);

                        System.out.println("Nome da campanha: ");
                        String nomeDaCampanha = scanner.nextLine();

                        boolean sairArrecadacao = false;
                        do {
                            System.out.println("Tipo de arrecadação: 1- Dinheiro, 2- Comida");
                            int tipo = scanner.nextInt();
                            scanner.nextLine();
                            if (tipo == 1) {
                                System.out.println("Descrição da arrecadação: ");
                                String descricao = scanner.nextLine();

                                Arrecadacao arrecadacao = new Arrecadacao(nomeDaCampanha, "Dinheiro", descricao, organizador);
                                servicoArrecadacao.adicionarArredacao(arrecadacao);
                                System.out.println("Arrecadação de dinheiro criada com sucesso!");
                                sairArrecadacao = true;
                            } else if (tipo == 2) {
                                System.out.println("Descrição da arrecadação: ");
                                String descricao = scanner.nextLine();

                                Arrecadacao arrecadacao = new Arrecadacao(nomeDaCampanha, "Comida", descricao, organizador);
                                servicoArrecadacao.adicionarArredacao(arrecadacao);
                                System.out.println("Arrecadação de comida criada com sucesso!");
                                sairArrecadacao = true;
                            } else {
                                System.out.println("Opção inválida, tente novamente.");
                            }
                        } while (!sairArrecadacao);
                        break;

                    case 3:
                        servicoArrecadacao.listarArrecadacoes();
                        break;
                    case 4:
                        sair = true;
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma das opções válidas.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um valor válido.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        } while (!sair);

        scanner.close();
    }
}
