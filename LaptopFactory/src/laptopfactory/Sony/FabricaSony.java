/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Sony;

import laptopfactory.Interfaces.Notebook;
import laptopfactory.Interfaces.Ultrabook;
import laptopfactory.Interfaces.FabricaDeLaptop;
import laptopfactory.Sony.Vaio;
import laptopfactory.Sony.VaioFit;

/**
 *
 * @author user
 */
public class FabricaSony implements FabricaDeLaptop {
    @Override 
    public Notebook criarNotebook(){
        return new VaioFit();
    }
    
    @Override 
    public Ultrabook criarUltrabook(){
        return new Vaio();
    }    
}
