/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Sony;

import laptopfactory.Interfaces.Notebook;

/**
 *
 * @author user
 */
public class VaioFit implements Notebook{

    @Override
    public void exibirInfoNotebook() {
        System.out.println("Modelo: VaioFit\nFábrica: Sony\nCategoria: Notebook\n");
    }
    
}
