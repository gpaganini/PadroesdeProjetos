/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopmethod.Apple;

import laptopmethod.Interfaces.Laptop;

/**
 *
* @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class MacbookPro implements Laptop {

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: MacbookPro\nFábrica: Apple");
    }
    
}
