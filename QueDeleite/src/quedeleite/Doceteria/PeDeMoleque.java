package quedeleite.Doceteria;
/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class PeDeMoleque extends DoceteriaPrototype{    
    protected PeDeMoleque(PeDeMoleque peDeMoleque) {
        this.valorCompra = peDeMoleque.getValorCompra();
    }
    
    public PeDeMoleque() {
        valorCompra = 0.0;
    }
    @Override
    public String exibirInfo() {
        return "Pé de Moleque \nFabrica de Doces QueDeleite\nPreço: R$" 
                +getValorCompra() ;
    }

    @Override
    public DoceteriaPrototype clonar() {
        return new PeDeMoleque(this);
    }    
}
