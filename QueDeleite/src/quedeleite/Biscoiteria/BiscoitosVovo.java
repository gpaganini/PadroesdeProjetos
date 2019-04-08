package quedeleite.Biscoiteria;
/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */

public class BiscoitosVovo implements BiscoiteriaFactory {

    @Override
    public Salgado biscoidoSalgado() {
        return new BiscoitoPolvilho();
    }

    @Override
    public Doce biscoitoDoce() {
        return new BiscoitoNata();
    }
}
