/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrariaoo;

import model.cliente;
import controller.CClientes;
import controller.CEditoras;
import controller.CLivros;
import controller.CVenda;
import java.util.Date;
import java.util.Scanner;
import model.editora;
import model.livro;
import model.vendaLvivro;

/**
 *
 * @author Gabriel Lopes
 */
public class LivrariaOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        cliente c2;
        CClientes cadClientes = new CClientes();
        CEditoras CE = new CEditoras();
        editora e = new editora();
        livro liv = new livro();
        CLivros Cadlivros = new CLivros();
        CVenda CV = new CVenda();

        int idCliente;
        String nomeCliente;
        String cpf = "";
        String cnpj = "";
        String endereco;
        String telefone;
        int aux;

        Scanner ler = new Scanner(System.in);
        cadClientes.mokClientes();
        Cadlivros.mokLivros();
        CE.mokEditoras();
        int op;
        do {
            System.out.println("Menu\n |1-Cadastro Cliente| \n |2-Consulta Clientes| \n |3-Cadastro Editora| \n |4-Consulta Editora| \n |5-Cadastro Livros| \n |6- Listar Livros Cadastrados| \n |7-Realizar uma venda|\n |8- Consultar vendas| \n |9-Atualiza Clientes|");
            op = ler.nextInt();
            switch (op) {
                case 1:

                    System.out.println("------Cadastro De Clientes------");
                    idCliente = cadClientes.addidC();
                    System.out.println("Qual o nome do Cliente?");
                    ler.nextLine();
                    nomeCliente = ler.nextLine();
                    boolean doc = false;
                    do {
                        System.out.println("O Cliente é 1-Pessoa física 2-Pessoa Jurídica");
                        aux = ler.nextInt();
                        System.out.println("Informe o documento");
                        ler.nextLine();
                        String cpfCNPJ = ler.nextLine();
                        cliente cliCpfCnpj;
                        cliCpfCnpj = cadClientes.pesqCli(aux, cpfCNPJ);

                        if (aux == 1 && cliCpfCnpj.getCpf() == null) {
                            cpf = cpfCNPJ;
                            doc=false;
                        } else if (aux == 2 && cliCpfCnpj.getCnpj() == null) {
                            cnpj = cpfCNPJ;
                            doc=false;
                        }
                        if (cadClientes.verificaCliente(cliCpfCnpj.getIdCliente())) {
                            System.out.println("Este documento Já existe!\n Tente novamente.");
                            doc=true;
                        }
                    } while (doc);
                    System.out.println("Qual o Endereço do cliente?");
                    endereco = ler.nextLine();
                    System.out.println("Qual o Telefone do Cliente?");
                    telefone = ler.nextLine();
                    c2 = new cliente(idCliente, nomeCliente, cpf, cnpj, endereco, telefone);
                    cadClientes.addClientes(c2);

                    break;
                case 2:

                    System.out.println("|Clientes Cadastrados|");
                    for (int i = 0; i < cadClientes.clientes.size(); i++) {
                        System.out.println("Cliente " + (i + 1) + "|"
                                + cadClientes.clientes.get(i).getNomeCliente());

                    }
                    break;
                case 3:
                    System.out.println("----Cadastro De Editoras----");
                    e.setIdEditora(CE.addIdEditora());
                    System.out.println("Qual O nome Da Editora?");
                    ler.nextLine();
                    e.setNmEditora(ler.nextLine());
                    System.out.println("Qual o endereço Da Editora?");
                    e.setEndereco(ler.nextLine());
                    System.out.println("Qual O nome Do gerente?");
                    e.setGerente(ler.nextLine());
                    System.out.println("Qual o Telefone da Editora?");
                    e.setTelefone(ler.nextLine());
                    CE.addEditora(e);
                    break;
                case 4:
                    for (int i = 0; i < CE.editora.size(); i++) {
                        System.out.println("Editoras Cadastradas\n" + (i + 1) + "|" + CE.editora.get(i).getNmEditora());
                    }
                    break;
                case 5:
                    liv.setIdLivro(Cadlivros.addIdL());
                    System.out.println("Escreva o Título do Livro");
                    ler.nextLine();
                    liv.setTitulo(ler.nextLine());
                    System.out.println("Qual o Assunto Do Livro?");
                    liv.setAssunto(ler.nextLine());
                    System.out.println("Qual o Autor Desse Livro?");
                    liv.setAutor(ler.nextLine());
                    System.out.println("Qual o ISBN Do Livro");
                    liv.setIsbn(ler.nextLine());
                    System.out.println("Quantos Livros há em estoque?");
                    liv.setEstoque(ler.nextInt());
                    System.out.println("Qual O Preço Do Livro");
                    liv.setPreco(ler.nextFloat());
                    boolean edtlok = true;
                    do {
                        System.out.println("Informe o ID da editora");
                        int edtLivr = ler.nextInt();
                        if (CE.verificaEditora(edtLivr)) {
                            edtlok = false;
                            liv.setIdEditora(edtLivr);
                        } else {
                            System.out.println("Editora inválida");
                        }
                    } while (edtlok);
                    Cadlivros.AddLivro(liv);
                    System.out.println("Livro " + liv.getTitulo() + "Cadastrado com Sucesso");
                    break;
                case 6:
                    System.out.println("|Livros Cadastrados|");
                    for (int i = 0; i < Cadlivros.getLivros().size(); i++) {
                        System.out.println("livro " + (i + 1) + "|"
                                + Cadlivros.getLivros().get(i));

                    }
                    break;
                case 7:
                    System.out.println("Cadastro De Vendas");
                    int idCli,
                     idLivro,
                     qtd;
                    float subTotal;
                    Date dataVenda = new Date(System.currentTimeMillis());
                    boolean verIdCli = true;
                    do {
                        System.out.println("Informe o ID Do Cliente");
                        idCliente = ler.nextInt();
                        if (cadClientes.verificaCliente(idCliente)) {
                            verIdCli = false;
                        } else {
                            System.out.println("Cliente Inválido, Tente Novamente!");
                        }
                    } while (verIdCli);
                    boolean verIdLiv = true;
                    do {
                        System.out.println("Informe o id Do Livro");
                        idLivro = ler.nextInt();
                        if (Cadlivros.verificaLivro(idLivro)) {
                            verIdLiv = false;
                        } else {
                            System.out.println("Livro Incorreto, tente novamente!");
                        }
                    } while (verIdLiv);
                    boolean verEstLiv = true;
                    do {
                        System.out.println("Informe a Quantidade comprada de Livros: ");
                        qtd = ler.nextInt();
                        if (Cadlivros.verEstoqueLivro(idLivro, qtd)) {
                            verEstLiv = false;
                            Cadlivros.atualizaEstoqueLivro(idLivro, qtd);
                        } else {
                            System.out.println("Estoque Insuficiente Para esta Compra.\n Tente novamente");
                        }
                    } while (verEstLiv);
                    subTotal = Cadlivros.verificaPreco(idLivro) * qtd;
                    System.out.println("Valor Da Venda: " + subTotal);
                    vendaLvivro vendaLivros = new vendaLvivro(idCliente, idLivro, qtd, dataVenda, subTotal);
                    CV.addVendaLivro(vendaLivros);
                    System.out.println("Venda Concluída Com Sucesso!");
                    break;
                case 8:
                    System.out.println("|Vendas Cadastradas|");
                    for (int i = 0; i < CV.getVendaLivros().size(); i++) {
                        System.out.println("Livro " + (i + 1) + "|"
                                + CV.getVendaLivros().get(i));

                    }
                    break;
                case 9:
                    System.out.println("|Atualizar Clientes|");
                    System.out.println("Pesquisa por:\n1-CPF\n2- CNPJ");
                    int cpfCNPJ = ler.nextInt();
                    String pesq;
                    System.out.println("Informe o Valor de pesquisa");
                    pesq = ler.next();
                    cliente Cliup;
                    Cliup = cadClientes.pesqCli(cpfCNPJ, pesq);
                    if (Cliup != null) {
                        System.out.println("Cliente Selecionado");
                        System.out.println(Cliup.getNomeCliente());
                        System.out.println("Novo Nome:");
                        ler.nextLine();
                        Cliup.setNomeCliente(ler.nextLine());
                    } else {
                        System.out.println("Cliente Não Encontrado!\n Tente Novamente!");
                    }
                    break;
                case 10:
                    System.out.println("Aplicação encerrada.");
            }
        } while (op > 0 && op < 11);

    }
}
