package creational.Factory.PizzaFactory;

public class MamTomPizza extends Pizza{
    @Override
    void prepare() {
        builder.append("Mắm tôm và thịt chó ướp riêng sả\n");
    }

    @Override
    void bake() {
        builder.append("Bánh đang được nấu");
    }

    @Override
    void cut() {
        builder.append("Bánh đang được cắn");
    }

    @Override
    void box() {
        builder.append("Bánh đã được đóng cmn hộp");
    }

    @Override
    public String toString() {
        return "MamTomPizza{" +
                "builder=" + builder +
                '}';
    }
}
