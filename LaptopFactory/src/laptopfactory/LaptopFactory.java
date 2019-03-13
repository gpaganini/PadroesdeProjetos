package laptopfactory;

import laptopfactory.Sony.FabricaSony;
import laptopfactory.Lenovo.FabricaLenovo;
import laptopfactory.Apple.FabricaApple;
import laptopfactory.Interfaces.Notebook;
import laptopfactory.Interfaces.Ultrabook;
import laptopfactory.Interfaces.FabricaDeLaptop;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

/**
 *
 * @author user
 */
public class LaptopFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaDeLaptop fabrica = new FabricaApple();
        Notebook notebook = fabrica.criarNotebook();
        Ultrabook ultrabook = fabrica.criarUltrabook();
        notebook.exibirInfoNotebook();
        System.out.println();
        ultrabook.exibirInfoUltrabook();
        System.out.println();        
        
        fabrica = new FabricaLenovo();
        notebook = fabrica.criarNotebook();
        ultrabook = fabrica.criarUltrabook();
        notebook.exibirInfoNotebook();
        System.out.println();
        ultrabook.exibirInfoUltrabook();
        System.out.println();
        
        fabrica = new FabricaSony();
        notebook = fabrica.criarNotebook();
        ultrabook = fabrica.criarUltrabook();
        notebook.exibirInfoNotebook();
        System.out.println();
        ultrabook.exibirInfoUltrabook();
        System.out.println();        
    }
    
}
