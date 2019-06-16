package com.company;



public class OrderByName extends TemplateOrdenador {
    @Override
    public boolean isFirst(Ebook ebook1, Ebook ebook2) {
        if (ebook1.nome.compareToIgnoreCase(ebook2.nome) <= 0) {
            return true;
        }
        return false;
    }
}
