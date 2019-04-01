/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopbuilder;

/**
 *
 * @author giovani.paganini
 */
public class LojaDirector {
    protected BuilderLaptop fabrica;
    
    public LojaDirector(BuilderLaptop fabrica) {
        this.fabrica = fabrica;
    }
    
    public void construirLaptop() {
        fabrica.buildPreco();
        fabrica.buildAnoModelo();
        fabrica.buildDscProcessador();
        fabrica.buildRam();
        fabrica.buildArmazenamento();
        fabrica.buildModelo();
        fabrica.buildFabricante();
    }
    
    public LaptopProduct getLaptopProduct() {
        return fabrica.getLaptop();
    }
}
