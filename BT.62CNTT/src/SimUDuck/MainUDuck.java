package SimUDuck;

public class MainUDuck {
    public static void main(String[] args) {
        Duck vb = new VitBau();
        vb.setFlyBehavior(new AddRoundFly());
        vb.setQuackBehavior(new AddQuack());
        vb.setSwimBehavior(new AddSwim());
        vb.display();
        vb.setQuackBehavior(new MuteQuack());
        vb.display();
    }
}
