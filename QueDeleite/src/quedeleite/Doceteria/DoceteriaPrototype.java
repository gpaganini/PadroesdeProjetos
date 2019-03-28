/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quedeleite.Doceteria;

/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public abstract class DoceteriaPrototype {
    protected double valorCompra;
    public abstract String exibirInfo();
    
    public abstract DoceteriaPrototype clonar();
    
    public double getValorCompra() {
        return valorCompra;
    }
    
    public void setValorCompra(double valorCompra) {
        this.valorCompra= valorCompra;
    }
}
