/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Apple;

import laptopfactory.Interfaces.Infinitybook;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class MacMini implements Infinitybook {
    @Override
    public void exibirInfoInfinitybook() {
        System.out.println("Modelo: MacMini\nFábrica: Apple\nCategoria: Infinitybook\n");
    }
}
