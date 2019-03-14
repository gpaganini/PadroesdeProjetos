/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Dell;

import laptopfactory.Interfaces.Ultrabook;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class Latitude implements Ultrabook {
    
    @Override
    public void exibirInfoUltrabook() {
        System.out.println("Modelo: Latitude\nFábrica: Dell\nCategoria: Ultrabook\n");
    }
}
