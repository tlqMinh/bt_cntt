package behavioral.TemplateMethod.BTD1;

import java.util.List;

public abstract class HoaDon {
    List<MatHang> dsHangHoa;

    public HoaDon(List<MatHang> dsHangHoa) {
        this.dsHangHoa = dsHangHoa;
    }

    public List<MatHang> getDsHangHoa() {
        return dsHangHoa;
    }
    public abstract double tinhTien();

    abstract double tinhChietKhau();

    public void hienThiGioHang() {
        System.out.println("Thông tin giỏ hàng:");
        for (MatHang hangHoa : dsHangHoa) {
            System.out.println("Tên mặt hàng: " + hangHoa.matHang);
            System.out.println("Số lượng: " + hangHoa.soLuong);
            System.out.println("Đơn giá: " + hangHoa.donGia);
        }
        System.out.println("Tổng tiền mua hàng: " + tinhTien());
        double chietKhau = tinhChietKhau();
        System.out.println("Tiền chiết khấu: " + chietKhau);
        System.out.println("Tiền khách hàng cần thanh toán: " + (tinhTien() - chietKhau));
    }

}

