package com.company;

public class Main {

    public static void main(String[] args) {
        Shelf minhaPrateleira = new Shelf(OrdemDeLeitura.porNome);
        minhaPrateleira.adicionarEbook("O Hobbit", "J. R. R. Tolkien", "1937", "Saraiva", 10);
        minhaPrateleira.adicionarEbook("O Escaravelho de Ouro", "Edgar Allan Poe", "2011", "L&PM Pocket", 8);
        minhaPrateleira.adicionarEbook("A Guerra dos Tronos", "George R. R. Martin", "1996", "Bantam Spectra", 7);
        minhaPrateleira.adicionarEbook("The Call of Cthulhu", "H.P. Lovecraft", "1928", "Hedra", 8);
        minhaPrateleira.adicionarEbook("A Casa Torta", "Agatha Christie", "1949", "Dodd, Mead & Co.", 9);

        System.out.println("=== Prateleira organizada por Nome ===");
        minhaPrateleira.mostrarListaDeLeitura();

        System.out.println("=== Prateleira organizada por Autor ===");
        minhaPrateleira.setOrdemDeLeitura(OrdemDeLeitura.porAutor);
        minhaPrateleira.mostrarListaDeLeitura();

        System.out.println("=== Prateleira organizada por Ano de Publicação ===");
        minhaPrateleira.setOrdemDeLeitura(OrdemDeLeitura.porAno);
        minhaPrateleira.mostrarListaDeLeitura();

        System.out.println("=== Prateleira organizada por Rating ===");
        minhaPrateleira.setOrdemDeLeitura(OrdemDeLeitura.porRating);
        minhaPrateleira.mostrarListaDeLeitura();

        System.out.println("=== Prateleira organizada por Editora ===");
        minhaPrateleira.setOrdemDeLeitura(OrdemDeLeitura.porEditora);
        minhaPrateleira.mostrarListaDeLeitura();
    }
}
