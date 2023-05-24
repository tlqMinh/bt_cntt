package SimUDuck;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    ISwimBehavior swimBehavior;

    public ISwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public void setSwimBehavior(ISwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public abstract void display();

    public void performQuack(){
        System.out.printf(quackBehavior.quack());
    }

    public void performFly(){
        System.out.printf(flyBehavior.fly());
    }

    public void swim(){
            System.out.printf(swimBehavior.swim());
    }

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
