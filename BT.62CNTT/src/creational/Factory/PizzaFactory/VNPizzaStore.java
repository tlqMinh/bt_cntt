package creational.Factory.PizzaFactory;

public class VNPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType type) {
        if(type == PizzaType.MamTom)
            return new MamTomPizza();
        if (type == PizzaType.MamNem)
            return new NamNemPizza();

        return null;
    }
}
