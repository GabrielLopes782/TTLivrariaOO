/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.vendaLvivro;

/**
 *
 * @author Gabriel Lopes
 */
public class CVenda {

    ArrayList<vendaLvivro> vendaLivros = new ArrayList<>();

    public void addVendaLivro(vendaLvivro vl) {
        vendaLivros.add(vl);
    }

    public ArrayList<vendaLvivro> getVendaLivros() {
        return vendaLivros;
    }
    
}
