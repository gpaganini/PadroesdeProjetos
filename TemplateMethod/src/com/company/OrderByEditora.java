package com.company;

public class OrderByEditora extends TemplateOrdenador {
    @Override
    public boolean isFirst(Ebook ebook1, Ebook ebook2) {
        if (ebook1.editora.compareToIgnoreCase(ebook2.editora) <=0 ) {
            return true;
        }
        return false;
    }
}
