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
public class AppleBuilder extends BuilderLaptop {

    @Override
    public void buildPreco() {
        laptop.preco = 24599.00;
    }

    @Override
    public void buildDscProcessador() {
        laptop.dscProcessador = "Intel Core i7 8ª Ger";
    }
    
    @Override
    public void buildRam() {
        laptop.ram = "16GB";
    }
    
    @Override
    public void buildArmazenamento() {
        laptop.armazenamento = "512GB SSD";
    }

    @Override
    public void buildAnoModelo() {
        laptop.anoModelo = 2018;
    }

    @Override
    public void buildModelo() {
        laptop.modelo = "MacBook Pro Retina 15\" ";
    }

    @Override
    public void buildFabricante() {
        laptop.fabricante = "Apple";
    }    
}