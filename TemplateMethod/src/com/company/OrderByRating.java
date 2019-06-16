package com.company;

public class OrderByRating extends TemplateOrdenador {
    @Override
    public boolean isFirst(Ebook ebook1, Ebook ebook2) {
        if (ebook1.rating > ebook2.rating) {
            return true;
        }
        return false;
    }
}
