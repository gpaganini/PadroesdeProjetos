/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Lenovo;

import laptopfactory.Lenovo.Ideapad;
import laptopfactory.Lenovo.Thinkpad;
import laptopfactory.Interfaces.Notebook;
import laptopfactory.Interfaces.Ultrabook;
import laptopfactory.Interfaces.FabricaDeLaptop;

/**
 *
 * @author user
 */
public class FabricaLenovo implements FabricaDeLaptop {

    @Override 
    public Notebook criarNotebook() {
        return new Ideapad();
    }
    
    @Override
    public Ultrabook criarUltrabook() {
        return new Thinkpad();
    }   
    
}
