package Strategy.BTC3;

public class GioHang {
    int giaTien;
    String day;
    IThanhToan thanhToan;
    IVanChuyen vanChuyen;
    IKhuyenMai khuyenMai;

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public void setThanhToan(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setVanChuyen(IVanChuyen vanChuyen) {
        this.vanChuyen = vanChuyen;
    }

    public void setKhuyenMai(IKhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public int thanhToan(){
        return giaTien + vanChuyen.VanChuyen() - thanhToan.thanhToan(giaTien) - khuyenMai.khuyenMai(giaTien);
    }

    public String hoaDon(){
        String day;
        int tienKM = thanhToan.thanhToan(giaTien) + khuyenMai.khuyenMai(giaTien);
        return "Tổng tiền: " + giaTien +
                "\nPhí vận chuyển: " + vanChuyen.VanChuyen() +
                "\n" + vanChuyen.soNgayGiao() +
                "\nKhuyến mãi: " + tienKM +
                "\nThành tiền: " + thanhToan();
    }
}
