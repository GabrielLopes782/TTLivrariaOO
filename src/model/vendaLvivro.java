                /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Gabriel Lopes
 */
public class vendaLvivro {
private int idCliente;
private int idLivro;
private int qtd;
private Date dataVenda;
private float subTotal;

    public vendaLvivro(int idCliente, int idLivro, int qtd, Date dataVenda, float subTotal) {
        this.idCliente = idCliente;
        this.idLivro = idLivro;
        this.qtd = qtd;
        this.dataVenda = dataVenda;
        this. subTotal=subTotal;
                
    }

    public vendaLvivro() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "vendaLvivro{" + "idCliente=" + idCliente + ", idLivro=" + idLivro + ", qtd=" + qtd + ", dataVenda=" + dataVenda + "SubTotal: "+subTotal+ '}';
    }

}
