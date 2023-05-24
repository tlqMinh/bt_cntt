package Structual.Decorator;

public abstract class CondimentDecorator extends Beverage {
    Beverage component;

    public CondimentDecorator(String description, Beverage component) {
        super(description);
        this.component = component;
    }

    @Override
    public String getDescription() {
        return component.getDescription();
    }
}
