package laptopsingleton;

import laptopsingleton.Apple.FabricaApple;
import laptopsingleton.Interfaces.FabricaDeLaptop;

/**
 *
 * @author giovani.paganini
 */
public class LaptopSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaDeLaptop fabrica = FabricaDeLaptop.getInstancia();
        System.out.println(fabrica.criarLaptopApple());
        System.out.println(fabrica.criarLaptopDell());
        
        System.out.println(fabrica.gerarRelatorio());
        
        fabrica = FabricaDeLaptop.getInstancia();
        System.out.println(fabrica.gerarRelatorio());
        
    }
    
}
