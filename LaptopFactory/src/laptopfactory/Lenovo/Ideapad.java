/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Lenovo;

import laptopfactory.Interfaces.Notebook;

/**
 *
 * @author user
 */
public class Ideapad implements Notebook {

    @Override
    public void exibirInfoNotebook() {
        System.out.println("Modelo: Ideapad\nFábrica: Lenovo\nCategoria: Notebook\n");
    }
    
}
