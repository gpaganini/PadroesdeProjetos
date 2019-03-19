/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopmethod;

import laptopmethod.Apple.FabricaApple;
import laptopmethod.Dell.FabricaDell;
import laptopmethod.Interfaces.FabricaDeLaptop;
import laptopmethod.Interfaces.Laptop;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class LaptopMethod {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaDeLaptop factory = new FabricaApple();
        Laptop laptop = factory.criarLaptop();
        laptop.exibirInfo();
        System.out.println();
        
        factory = new FabricaDell();
        laptop = factory.criarLaptop();
        laptop.exibirInfo();
        System.out.println();
        
    }
    
}
