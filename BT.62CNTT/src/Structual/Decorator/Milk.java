package Structual.Decorator;

public class Milk extends CondimentDecorator{
    public Milk(String description, Beverage component) {
        super(description, component);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description;
    }

    @Override
    double cost() {
        return 4 + component.cost();
    }
}
