package SimUDuck;

public class VitBau extends Duck{
    @Override
    public void display() {
        System.out.println("\nI'm Vit bau");
        performFly();
        performQuack();
        swim();
    }
}
