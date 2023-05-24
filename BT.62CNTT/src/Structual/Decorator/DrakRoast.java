package Structual.Decorator;

public class DrakRoast extends Beverage{
    public DrakRoast(String description, String description1) {
        super(description);
        this.description = description1;
    }

    String description;

    @Override
    double cost() {
        return 4;
    }
}
