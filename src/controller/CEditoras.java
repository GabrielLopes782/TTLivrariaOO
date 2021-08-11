/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.editora;

/**
 *
 * @author Gabriel Lopes
 */
public class CEditoras {
    
    public ArrayList<editora> editora = new ArrayList();
    int idEditora;
    public void addEditora(editora e) {
        this.editora.add(e);
        
    }

    public void mokEditoras() {
        editora edt = new editora();
        edt.setIdEditora(addIdEditora());
        edt.setNmEditora("Senac");
        edt.setEndereco("Venancio Aires");
        edt.setTelefone("51 89228422");
        edt.setGerente("Visotto");
        this.addEditora(edt);
        editora edt2 = new editora();
        edt2.setIdEditora(addIdEditora());
        edt2.setNmEditora("Lpm");
        edt2.setEndereco("São Paulo");
        edt2.setTelefone("51 32612422");
        edt2.setGerente("Abreu");
        this.addEditora(edt2);
        this.addEditora(edt2);
    }
    
    public Boolean verificaEditora(int e) {
        Boolean verEditora = false;
        for (editora edt : editora) {
            if (edt.getIdEditora() == e) {
                verEditora = true;
            }
            
        }
        return verEditora;
    }
    public int addIdEditora(){
        idEditora++;
        return idEditora;
    }
}
