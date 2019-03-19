/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopmethod.Dell;

import laptopmethod.Interfaces.Laptop;

/**
 *
 * @author giovani.paganini
 */
public class Latitude implements Laptop {
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Latitude\nFábrica: Dell");
    }
}
