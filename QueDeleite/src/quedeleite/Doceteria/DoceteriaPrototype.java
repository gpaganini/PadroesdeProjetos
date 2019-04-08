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
        this.valorCompra = valorCompra;
    }
}
