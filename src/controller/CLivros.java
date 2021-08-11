/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;

import model.livro;

/**
 *
 * @author Gabriel Lopes
 */
public class CLivros {

    ArrayList<livro> livros = new ArrayList<>();
int idLivro;
    public void mokLivros() {

        livro liv = new livro();
        liv.setIdLivro(this.addIdL());
        liv.setTitulo("Pequeno Principe");
        liv.setAssunto("Ludico");
        liv.setAutor("Eu");
        liv.setIsbn("123123");
        liv.setIdEditora(1);
        liv.setEstoque(10);
        liv.setPreco((float) 1.5);
        this.AddLivro(liv);
        livro liv2 = new livro();
        liv2.setIdLivro(this.addIdL());
        liv2.setTitulo("Steve Jobs");
        liv2.setAssunto("Biografia");
        liv2.setAutor("Walter Isaacson");
        liv2.setIsbn("978-85-359-1971-4");
        liv2.setIdEditora(2);
        liv2.setEstoque(20);
        liv2.setPreco((float) 35);
        this.AddLivro(liv2);
        livro liv3 = new livro();
        liv3.setIdLivro(this.addIdL());
        liv3.setTitulo("Peixe");
        liv3.setAssunto("Business");
        liv3.setAutor("Stephen");
        liv3.setIsbn("85-352-0711-2");
        liv3.setIdEditora(1);
        liv3.setEstoque(10);
        liv3.setPreco((float) 25);
        this.AddLivro(liv3);
    }

    public void AddLivro(livro l) {
        this.livros.add(l);

    }

    public ArrayList<livro> getLivros() {
        return livros;
    }

    public Boolean verificaLivro(int idLivro) {
        boolean verLivro = false;
        for (livro livro1 : livros) {
            if (livro1.getIdLivro() == idLivro) {
                verLivro = true;
                System.out.println("Livro:" + livro1.getTitulo());
            }

        }

        return verLivro;
    }

    public Boolean verEstoqueLivro(int idLivro, int qtd) {
        boolean verEstoqueLivro = false;
        for (livro Estoqueliv : livros) {
            if (Estoqueliv.getIdLivro() == idLivro && Estoqueliv.getEstoque() > qtd) {
                verEstoqueLivro = true;
                System.out.println("Estoque Atualizado" + Estoqueliv.getEstoque());
            }

        }

        return verEstoqueLivro;

    }

    public void atualizaEstoqueLivro(int idLivro, int qtd) {
        for (livro upEstoqueLivro : livros) {
            if (upEstoqueLivro.getIdLivro() == idLivro) {
                int upEstoque = upEstoqueLivro.getEstoque() - qtd;
                upEstoqueLivro.setEstoque(upEstoque);
                System.out.println("Estoque Anterior" + upEstoqueLivro.getEstoque());

            }
        }
    }

    public float verificaPreco(int idLivro) {
        float preco = 0;
        for (livro prlivro : livros) {
            if (prlivro.getIdLivro() == idLivro) {
                return prlivro.getPreco();
            }

        }
        return preco;
    }

    public int verificaEstoque(int idLivro) {
        int estoqueAtual = 0;
        for (livro prlivro : livros) {
            if (prlivro.getIdLivro() == idLivro) {
                estoqueAtual = prlivro.getEstoque();
            }
        }

        return estoqueAtual;
    }
    public int addIdL(){
        
        this.idLivro++;
        return idLivro;
    }
}
