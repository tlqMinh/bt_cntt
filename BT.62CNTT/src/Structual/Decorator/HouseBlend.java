package Structual.Decorator;

public class HouseBlend extends Beverage{
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    double cost() {
        return 3;
    }
}
