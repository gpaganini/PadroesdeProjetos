package quedeleite.Boloteria;
/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */

public class BoloCasamento implements BoloteriaFactory {

    @Override
    public Bolo criarBolo() {
        return new VeuDeNoiva();
    }
}
