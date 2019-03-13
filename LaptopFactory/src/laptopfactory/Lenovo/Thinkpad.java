/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Lenovo;

import laptopfactory.Interfaces.Ultrabook;

/**
 *
 * @author user
 */
public class Thinkpad implements Ultrabook {

    @Override
    public void exibirInfoUltrabook() {
        System.out.println("Modelo: Thinkpad\nFábrica: Lenovo\nCategoria: Notebook\n");                
    }
    
}
