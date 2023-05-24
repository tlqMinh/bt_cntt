package Structual.Decorator;

public abstract class Beverage {
    String description;

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract double cost();
}
