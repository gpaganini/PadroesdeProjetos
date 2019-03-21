/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopprototype;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class LaptopPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MacbookPrototype prototipomac = new MacbookPrototype();
        
        PrototypeLaptop novomac = prototipomac.clonar();
        novomac.setValorCompra(32000.0);
        PrototypeLaptop macusado = prototipomac.clonar();
        macusado.setValorCompra(8000.0);
        
        System.out.println(novomac.exibirInfo());
        System.out.println(macusado.exibirInfo());
        
    }
    
}
