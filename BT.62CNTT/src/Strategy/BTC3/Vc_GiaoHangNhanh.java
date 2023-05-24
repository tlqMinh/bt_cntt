package Strategy.BTC3;

public class Vc_GiaoHangNhanh implements IVanChuyen{
    @Override
    public int VanChuyen() {
        return 42000;
    }

    public String soNgayGiao(){
        return "Giao hàng sau 4 ngày";
    }
}
