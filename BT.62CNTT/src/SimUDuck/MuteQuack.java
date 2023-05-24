package SimUDuck;

public class MuteQuack implements IQuackBehavior {
    @Override
    public String quack() {
        return "\nKeep silent";
    }
}
