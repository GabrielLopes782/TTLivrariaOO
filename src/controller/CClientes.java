/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.cliente;

/**
 *
 * @author Gabriel Lopes
 */
public class CClientes {

    public ArrayList<cliente> clientes = new ArrayList<>();
    int idCliente;

    public void mokClientes() {
        cliente cli = new cliente();
        cli.setIdCliente(addidC());
        cli.setNomeCliente("Jair Ferraz");
        cli.setCpf("123");
        cli.setCnpj("");
        cli.setEndereco("Flores da Cunha ");
        cli.setTelefone("5132616214");
        this.addClientes(cli);
        cliente cli2 = new cliente();
        cli2.setIdCliente(addidC());
        cli2.setNomeCliente("Laurencio de la porcatcho");
        cli2.setCpf("456");
        cli2.setCnpj("");
        cli2.setEndereco("Mauriocao ");
        cli2.setTelefone("513999956456");
        this.addClientes(cli2);
    }

    public void addClientes(cliente c) {
        this.clientes.add(c);

    }

    public Boolean verificaCliente(int idCliente) {
        boolean verCliente = false;
        for (cliente cli : clientes) {
            if (cli.getIdCliente() == idCliente) {
                verCliente = true;
                System.out.println("Cliente: " + cli.getNomeCliente());
            }

        }

        return verCliente;
    }

    public cliente pesqCli(int cpfCNPJ, String pesq) {
        cliente c = new cliente();
        switch (cpfCNPJ) {
            case 1:
                for (cliente cli : clientes) {
                    if (cli.getCpf().equals(pesq)) {
                        c = cli;
                    }
                }

                break;
            case 2:
                for (cliente cli : clientes) {
                    if (cli.getCnpj().equals(pesq)) {
                        c = cli;
                    }
                }
                break;
            default:
                System.out.println("Cliente não Encontrado!!!");
                break;
        }
        return c;
    }

    public int addidC() {
       this.idCliente++; 
        return idCliente;
    }

}
