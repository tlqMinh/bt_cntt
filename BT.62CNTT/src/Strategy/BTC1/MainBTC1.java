package Strategy.BTC1;

public class MainBTC1 {
    public static void main(String[] args) {
        context c = new context();

        float a = 75, b = 12;
        c.setTinhToan(new Cong());
        System.out.println(a + " + " + b + " = " + c.tinhToan(a,b));

        a = 54; b = 78;
        c.setTinhToan(new Tru());
        System.out.println(a + " - " + b + " = " + c.tinhToan(a,b));
    }
}
