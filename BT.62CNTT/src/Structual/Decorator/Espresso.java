package Structual.Decorator;

public class Espresso extends Beverage{
    public Espresso(String description) {
        super(description);
    }

    @Override
    double cost() {
        return 2;
    }
}
