package quedeleite.Doceteria;
/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class DoceDeLeite extends DoceteriaPrototype{
    protected DoceDeLeite(DoceDeLeite doceDeLeite) {
        this.valorCompra = doceDeLeite.getValorCompra();
    }
    
    public DoceDeLeite() {
        valorCompra = 0.0;
    }
    @Override
    public String exibirInfo() {
        return "Doce de Leite\nFabrica de Doces QueDeleite\nPreço: R$" 
                +getValorCompra() ;
    }

    @Override
    public DoceteriaPrototype clonar() {
        return new DoceDeLeite(this);
    }
    
}
