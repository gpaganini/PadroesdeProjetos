package quedeleite.Boloteria;
/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class BoloExecutivo implements BoloteriaFactory {

    @Override
    public Bolo criarBolo() {
        return new BoloFerreroRocher();
    }
    
}
