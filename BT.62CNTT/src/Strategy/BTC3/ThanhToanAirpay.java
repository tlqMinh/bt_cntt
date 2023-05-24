package Strategy.BTC3;

public class ThanhToanAirpay implements IThanhToan{
    @Override
    public int thanhToan(int giaTien) {
        if(giaTien > 1000000){
            return (int) (giaTien * 0.3);
        }
        return 0;
    }
}
