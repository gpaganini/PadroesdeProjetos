/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Sony;

import laptopfactory.Interfaces.Ultrabook;

/**
 *
 * @author user
 */
public class Vaio implements Ultrabook{

    @Override
    public void exibirInfoUltrabook() {
        System.out.println("Modelo: Vaio\nFábrica: Sony\nCategoria: Ultrabook\n");
    }
    
}
