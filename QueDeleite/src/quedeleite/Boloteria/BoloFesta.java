package quedeleite.Boloteria;
/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */

public class BoloFesta implements BoloteriaFactory {

    @Override
    public Bolo criarBolo() {
        return new Chocolate();
    }
}
