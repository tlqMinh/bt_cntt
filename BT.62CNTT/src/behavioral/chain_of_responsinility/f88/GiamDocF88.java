package behavioral.chain_of_responsinility.f88;

public class GiamDocF88 implements IXulyVay{
    String ten;
    int hanMucChoVay;

    @Override
    public String xuLyKhoanVay(int tienVay) {
        if(tienVay <= hanMucChoVay)
            return "Giám đốc" + ten + " xử lý khoản vay";
        return "Ra ngân hàng vay";
    }

    @Override
    public IXulyVay capCaoHon(IXulyVay xulyVay) {
        return null;
    }
}
