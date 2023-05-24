package Structual.Decorator;

public class Mocha extends CondimentDecorator{
    public Mocha(String description, Beverage component) {
        super(description, component);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description;
    }

    @Override
    double cost() {
        return 6 + component.cost();
    }
}
