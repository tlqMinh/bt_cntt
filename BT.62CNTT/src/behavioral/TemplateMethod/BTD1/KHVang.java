package behavioral.TemplateMethod.BTD1;

import java.util.List;

public class KHVang extends HoaDon{

    public KHVang(List<MatHang> dsHangHoa) {
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
        if(tongTien >= 500000) {
            return tongTien * 0.03;
        }else if(tongTien >= 1000000){
            return tongTien * 0.05;
        }
        return 0;
    }
}
