/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopfactory.Sony;

import laptopfactory.Interfaces.Infinitybook;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class VaioInfinity implements Infinitybook{
    @Override
    public void exibirInfoInfinitybook() {
        System.out.println("Modelo: Vaio Infinity\nFábrica: Sony\nCategoria: InfinityBook\n");                
    }
}
