package quedeleite.Doceteria;
/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */

public class Suspiro extends DoceteriaPrototype {

    protected Suspiro(Suspiro suspiro) {
        this.valorCompra = suspiro.getValorCompra();
    }

    public Suspiro() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Suspiro de Morango\nFabrica de Doces QueDeleite\nPreço: R$" + getValorCompra();
    }

    @Override
    public DoceteriaPrototype clonar() {
        return new Suspiro(this);
    }
}
