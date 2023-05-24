package creational.Factory.PizzaFactory;

public class NamNemPizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Mắm nêm thịt luộc cà pháo\n");
    }

    @Override
    void bake() {
        builder.append("Đang nấu mắm nêm và luộc thịt");
    }

    @Override
    void cut() {

    }

    @Override
    void box() {

    }
}
