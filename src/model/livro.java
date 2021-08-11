/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gabriel Lopes
 */
public class livro {
private String titulo;
private String autor;
private String assunto;
private String isbn;
private int estoque;
private int idEditora;
private int idLivro;
private float preco;
    public livro() {
    }

    public livro(String titulo, String autor, String assunto, String isbn, int estoque, int idEditora, int idLivro, float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.assunto = assunto;
        this.isbn = isbn;
        this.estoque = estoque;
        this.idEditora = idEditora;
        this.idLivro=idLivro;
        this.preco=preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    @Override
    public String toString() {
        return "livro{ idLivro, "+idLivro + "titulo=" + titulo + ", autor=" + autor + ", assunto=" + assunto + ", isbn=" + isbn + ", estoque=" + estoque + ", idEditora=" + idEditora + "Preço: "+preco+  '}';
    }
     
}
