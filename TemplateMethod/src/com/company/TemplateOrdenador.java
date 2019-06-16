package com.company;

import java.util.ArrayList;

public abstract class TemplateOrdenador {
    public abstract boolean isFirst(Ebook ebook1, Ebook ebook2);

    public ArrayList<Ebook> ordernarEbook(ArrayList<Ebook> lista) {
        ArrayList<Ebook> novaLista = new ArrayList<Ebook>();
        for (Ebook ebook : lista) {
            novaLista.add(ebook);
        }

        for (int i = 0; i < novaLista.size(); i++) {
            for (int j = i; j < novaLista.size(); j++) {
                if (!isFirst(novaLista.get(i), novaLista.get(j))) {
                    Ebook aux = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, aux);
                }
            }
        }
        return novaLista;
    }

}
