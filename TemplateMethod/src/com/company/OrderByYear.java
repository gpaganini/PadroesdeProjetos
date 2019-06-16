package com.company;

public class OrderByYear extends TemplateOrdenador {
    @Override
    public boolean isFirst(Ebook ebook1, Ebook ebook2) {
        if (ebook1.anoPublicacao.compareToIgnoreCase(ebook2.anoPublicacao) <=0 ){
            return true;
        }
        return false;
    }
}
