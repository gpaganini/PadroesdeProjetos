/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Apple;

import laptopfactory.Apple.MacbookPro;
import laptopfactory.Apple.MacbookAir;
import laptopfactory.Interfaces.Notebook;
import laptopfactory.Interfaces.Ultrabook;
import laptopfactory.Interfaces.FabricaDeLaptop;
import laptopfactory.Interfaces.Infinitybook;

/**
 *
 * @author user
 */
public class FabricaApple implements FabricaDeLaptop {
    @Override
    public Notebook criarNotebook() {
        return new MacbookAir();
    }
    
    @Override
    public Ultrabook criarUltrabook() {
        return new MacbookPro();
    }    

    @Override
    public Infinitybook criarInfinitybook() {
        return new MacMini();
    }
}
