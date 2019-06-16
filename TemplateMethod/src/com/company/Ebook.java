package com.company;

public class Ebook {
    String nome;
    String autor;
    String anoPublicacao;
    String editora;
    int rating;

    public Ebook(String nome, String autor, String anoPublicacao, String editora, int rating) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.rating = rating;
    }
}
