package com.company;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<Ebook> biblioteca;
    protected TemplateOrdenador ordenador;

    public Shelf(OrdemDeLeitura ordem) {
        biblioteca = new ArrayList<Ebook>();
        switch (ordem) {
            case porAno:
                ordenador = new OrderByYear();
                break;
            case porAutor:
                ordenador = new OrderByAuthor();
                break;
            case porRating:
                ordenador = new OrderByRating();
                break;
            case porNome:
                ordenador = new OrderByName();
                break;
            case porEditora:
                ordenador = new OrderByEditora();
                break;
            default:
                break;
        }
    }

    public void setOrdemDeLeitura(OrdemDeLeitura ordem) {
        ordenador = null;
        switch (ordem) {
            case porAno:
                ordenador = new OrderByYear();
                break;
            case porAutor:
                ordenador = new OrderByAuthor();
                break;
            case porRating:
                ordenador = new OrderByRating();
                break;
            case porNome:
                ordenador = new OrderByName();
                break;
            case porEditora:
                ordenador = new OrderByEditora();
                break;
            default:
                break;
        }
    }

    public void adicionarEbook(String nome, String autor, String ano, String editora, int rating) {
        biblioteca.add(new Ebook(nome, autor, ano, editora, rating));
    }

    public void mostrarListaDeLeitura() {
        ArrayList<Ebook> novaLista = new ArrayList<Ebook>();
        novaLista = ordenador.ordernarEbook(biblioteca);

        for (Ebook ebook : novaLista) {
            System.out.println(ebook.nome + " - "
            + ebook.autor + "\nAno: "
            + ebook.anoPublicacao + "\nRating: "
            + ebook.rating + "\nEditora: "
            + ebook.editora + "\n"
            );
        }
    }
}
