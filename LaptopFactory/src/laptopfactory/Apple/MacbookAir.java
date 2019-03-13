/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Apple;

import laptopfactory.Interfaces.Notebook;

/**
 *
 * @author user
 */
public class MacbookAir implements Notebook {
    @Override
    public void exibirInfoNotebook() {
        System.out.println("Modelo: MacbookAir\nFábrica: Apple\nCategoria: Notebook\n");
    }    
}
