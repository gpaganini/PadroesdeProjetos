package quedeleite.Boloteria;
/**
 *
 * @author Giovani Paganini <giovanipaganini@outlook.com>
 */
public class BoloAniversario implements BoloteriaFactory {

    @Override
    public Bolo criarBolo() {
        return new BoloBenDez();
    }
    
}
