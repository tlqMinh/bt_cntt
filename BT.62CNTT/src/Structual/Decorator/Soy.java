package Structual.Decorator;

public class Soy extends CondimentDecorator{

    public Soy(String description, Beverage component) {
        super(description, component);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.description;
    }

    @Override
    double cost() {
        return 5 + component.cost();
    }
}
