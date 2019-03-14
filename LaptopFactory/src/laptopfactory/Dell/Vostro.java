/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Dell;

import laptopfactory.Interfaces.Infinitybook;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class Vostro implements Infinitybook {
    
    @Override
    public void exibirInfoInfinitybook() {
        System.out.println("Modelo: Vostro\nFábrica: Dell\nCategoria: Infinitybook\n");
    }
}
