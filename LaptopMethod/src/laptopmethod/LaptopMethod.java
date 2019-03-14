/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopmethod;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class LaptopMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryLaptop factory = new FactoryLaptop();
        String modelo = "Macbook";
        String marca = "Apple";
        
        factory.getLaptop(modelo, marca);
    }
    
}
