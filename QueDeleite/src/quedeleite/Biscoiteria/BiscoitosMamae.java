package quedeleite.Biscoiteria;
/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class BiscoitosMamae implements BiscoiteriaFactory {

    @Override
    public Salgado biscoidoSalgado() {
        return new BiscoitoQueijo();
    }

    @Override
    public Doce biscoitoDoce() {
        return new BiscoitoMel();
    }
    
}
