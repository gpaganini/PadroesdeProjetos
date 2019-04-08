package quedeleite.Doceteria;
/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */

public class Pacoca extends DoceteriaPrototype {

    protected Pacoca(Pacoca pacoca) {
        this.valorCompra = pacoca.getValorCompra();
    }

    public Pacoca() {
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo() {
        return "Paçoquinha\nFabrica de Doces QueDeleite\nPreço: R$" + getValorCompra();
    }

    @Override
    public DoceteriaPrototype clonar() {
        return new Pacoca(this);
    }
}
