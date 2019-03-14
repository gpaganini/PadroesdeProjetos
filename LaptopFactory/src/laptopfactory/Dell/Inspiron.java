/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Dell;

import laptopfactory.Interfaces.Notebook;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class Inspiron implements Notebook {
    @Override
    public void exibirInfoNotebook() {
        System.out.println("Modelo: Inspiron\nFábrica: Dell\nCategoria: Notebook\n");
    }
}
