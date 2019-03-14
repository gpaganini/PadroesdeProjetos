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
class Ultrabook extends Laptop {
    public Ultrabook(String modelo) {
        this.modelo = modelo;
        System.out.println("Modelo: " + this.modelo);
    }
}
