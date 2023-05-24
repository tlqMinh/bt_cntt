package behavioral.TemplateMethod.BTD1;

import java.util.List;

public class KHKimCuong extends HoaDon{
    public KHKimCuong(List<MatHang> dsHangHoa) {
        super(dsHangHoa);
    }

    @Override
    public double tinhTien() {
        double tongTien = 0;
        for(MatHang matHang : dsHangHoa){
            tongTien += matHang.donGia * matHang.soLuong;
        }
        return tongTien;
    }

    @Override
    double tinhChietKhau() {
        double tongTien = tinhTien();
        if (tongTien >= 500000 && tongTien < 1000000) {
            return tongTien * 0.03;
        } else if (tongTien >= 1000000 && tongTien < 1500000) {
            return tongTien * 0.05;
        } else if (tongTien >= 1500000) {
            return tongTien * 0.06;
        }
        return 0;
    }
}
