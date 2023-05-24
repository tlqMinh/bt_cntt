package creational.Factory.PizzaFactory;

public abstract class PizzaStore {
    abstract protected Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
