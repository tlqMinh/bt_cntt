package creational.builder.BaiTap1;

public class CTHD {
    String sP;
    int soLuong;
    double donGia, chietKhau;

    public CTHD(String sP, int soLuong, double donGia, double chietKhau) {
        this.sP = sP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD:" +
                "sP='" + sP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", chietKhau=" + chietKhau;
    }
}
