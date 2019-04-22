/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopsingleton.Interfaces;

public class FabricaDeLaptop {
    protected int totalLaptopsApple;
    protected int totalLaptopsDell;    
    
    public static FabricaDeLaptop instancia;
    
    public FabricaDeLaptop(){        
    }
    
    public static FabricaDeLaptop getInstancia() {
        if (instancia == null)
                instancia = new FabricaDeLaptop();
        return instancia;
    }
    
    public String criarLaptopApple() {
        return new String("Laptop Apple #" + totalLaptopsApple++ + " criado.");
    }
    
    public String criarLaptopDell() {
        return new String("Laptop Apple #" + totalLaptopsDell++ + " criado.");
    }
    
    public String gerarRelatorio() {
        return new String("Total de laptops Apple vendidos: " + totalLaptopsApple +
                "\nTotal de laptops Dell vendidos: " + totalLaptopsDell);
    }
}