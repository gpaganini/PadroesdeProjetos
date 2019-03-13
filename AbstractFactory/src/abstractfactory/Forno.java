package abstractfactory;

/**
 *
 * @author giovani paganini
 */
public class Forno implements Pizzaria {
    @Override
    public PizzaGrande assarPizzaGrande() {
        return new Calabresa();
    }
    
    @Override
    public PizzaMedia assarPizzaMedia() {
        return new Portuguesa();
    }
}

