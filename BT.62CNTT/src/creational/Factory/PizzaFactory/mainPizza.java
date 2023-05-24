package creational.Factory.PizzaFactory;

public class mainPizza {
    public static void main(String[] args) {
        PizzaStore pz = new VNPizzaStore();
        Pizza pizza = pz.orderPizza(PizzaType.MamTom);
        Pizza pizza1 = pz.orderPizza(PizzaType.MamNem);
        System.out.printf(pizza.toString());
    }
}
