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
public abstract class BuilderLaptop {
    
    protected LaptopProduct laptop;
    
    public BuilderLaptop() {
        laptop = new LaptopProduct();
    }
    
    public abstract void buildPreco();
    public abstract void buildDscProcessador();
    public abstract void buildRam();
    public abstract void buildArmazenamento();
    public abstract void buildAnoModelo();
    public abstract void buildModelo();
    public abstract void buildFabricante();
    
    public LaptopProduct getLaptop(){
        return laptop;
    }
}