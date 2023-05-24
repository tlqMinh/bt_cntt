package Strategy.BTC3;

public class Vc_NinjaVan implements IVanChuyen{
    @Override
    public int VanChuyen() {
        return 35000;
    }
    public String soNgayGiao(){
        return "Giao hàng sau 5 ngày";
    }
}
