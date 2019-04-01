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
public class LaptopBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LojaDirector loja = new LojaDirector(
                new AppleBuilder());
        
        loja.construirLaptop();
        LaptopProduct laptop = loja.getLaptopProduct();
        System.out.println("Laptop: " + laptop.fabricante +" / "+ laptop.modelo 
                + "\nProcessador: " + laptop.dscProcessador
                + "\nRAM: " + laptop.armazenamento
                + "\nArmazenamento: " + laptop.armazenamento
                + "\nAno: " + laptop.anoModelo 
                + "\nValor: " + laptop.preco);
        System.out.println();
        
        loja = new LojaDirector(new DellBuilder());        
        loja.construirLaptop();
        laptop = loja.getLaptopProduct();
        System.out.println("Laptop: " + laptop.fabricante +" / "+ laptop.modelo 
                + "\nProcessador: " + laptop.dscProcessador
                + "\nRAM: " + laptop.armazenamento
                + "\nArmazenamento: " + laptop.armazenamento
                + "\nAno: " + laptop.anoModelo 
                + "\nValor: " + laptop.preco);
        System.out.println();
    }
    
}
