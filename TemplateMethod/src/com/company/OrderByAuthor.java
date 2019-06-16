package com.company;

public class OrderByAuthor extends TemplateOrdenador {
    @Override
    public boolean isFirst(Ebook ebook1, Ebook ebook2) {
        if (ebook1.autor.compareToIgnoreCase(ebook2.autor) <=0 ) {
            return true;
        }
        return false;
    }
}
