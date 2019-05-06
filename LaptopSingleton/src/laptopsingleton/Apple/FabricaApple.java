/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopsingleton.Apple;

import laptopsingleton.Interfaces.FabricaDeLaptop;
import laptopsingleton.Interfaces.Laptop;


/**
 *
* @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class FabricaApple extends FabricaDeLaptop {
    public Laptop criarLaptop() {
        return new MacbookPro();
    }
}
