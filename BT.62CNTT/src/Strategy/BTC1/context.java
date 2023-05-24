package Strategy.BTC1;

public class context{
    Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public Tinh tinh(float a, float b) {
        return null;
    }

    public float tinhToan(float a, float b) {
        return tinhToan.tinh(a,b);
    }
}
