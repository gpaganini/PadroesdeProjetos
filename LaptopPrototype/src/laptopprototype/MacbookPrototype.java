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
public class MacbookPrototype extends PrototypeLaptop {
    
    protected MacbookPrototype(MacbookPrototype macbookPrototype) {
        this.valorCompra = macbookPrototype.getValorCompra();
    }
    
    public MacbookPrototype() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Modelo: Macbook\nMarca: Apple\n" + "Valor: US$"
                + getValorCompra() + "\n";
    }

    @Override
    public PrototypeLaptop clonar() {
        return new MacbookPrototype(this);
    }
    
}
