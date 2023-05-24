package Strategy.BTC3;

public class ThanhToanCOD implements IThanhToan{
    @Override
    public int thanhToan(int giaTien) {
        if(giaTien > 2000000){
            return (int) (giaTien * 0.2);
        }
        return 0;
    }
}
