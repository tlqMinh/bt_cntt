package behavioral.TemplateMethod.BTD1;

import java.util.ArrayList;
import java.util.List;

public class MainD1 {
    public static void main(String[] args) {
        List<MatHang> dsHangHoa = new ArrayList<>();
        dsHangHoa.add(new MatHang("Sữa",15,8000));
        dsHangHoa.add(new MatHang("Bánh",21,12000));
        dsHangHoa.add(new MatHang("Đồ",75,32000));

        HoaDon KH1 = new KHThanThiet(dsHangHoa);
        KH1.hienThiGioHang();
        HoaDon KH2 = new KHVang(dsHangHoa);
        KH2.hienThiGioHang();
        HoaDon KH3 = new KHKimCuong(dsHangHoa);
        KH3.hienThiGioHang();
    }
}
