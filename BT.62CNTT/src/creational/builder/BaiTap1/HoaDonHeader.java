package creational.builder.BaiTap1;

public class HoaDonHeader {
    String maHD, tenKH, ngayBan;

    public HoaDonHeader(String maHD, String tenKH, String ngayBan) {
        this.maHD = maHD;
        this.tenKH = tenKH;
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "maHD='" + maHD + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", ngayBan='" + ngayBan + '\'';
    }
}
