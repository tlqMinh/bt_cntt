package Strategy.BTC3;

public class KhuyenMai implements IKhuyenMai{
    @Override
    public int khuyenMai(int giaTien) {
        if(giaTien >= 4000000) return (int) (0.4 * giaTien);
        else if (giaTien >= 3000000) return (int) (0.3 * giaTien);
        else if(giaTien >= 2000000) return (int) (0.2 * giaTien);
        else if(giaTien >= 100000) return (int) (0.1 * giaTien);
        else return 0;
    }
}
