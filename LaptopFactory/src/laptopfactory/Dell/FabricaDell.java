/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Dell;

import laptopfactory.Interfaces.FabricaDeLaptop;
import laptopfactory.Interfaces.Infinitybook;
import laptopfactory.Interfaces.Notebook;
import laptopfactory.Interfaces.Ultrabook;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class FabricaDell implements FabricaDeLaptop{
    @Override
    public Notebook criarNotebook() {
        return new Inspiron();
    }
    
    @Override
    public Ultrabook criarUltrabook() {
        return new Latitude();
    }
    
    @Override
    public Infinitybook criarInfinitybook() {
        return new Vostro();
    }
}
