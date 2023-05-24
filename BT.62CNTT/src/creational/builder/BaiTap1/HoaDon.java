package creational.builder.BaiTap1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {

    HoaDonHeader hoaDonHeader;
    List<CTHD> cthds;

    public HoaDon(Builder builder) {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.cthds = builder.cthds;
    }

    @Override
    public String toString() {
        return "HoaDon:\n" + hoaDonHeader +
                "\n" + cthds ;
    }

    public static class Builder {

        HoaDonHeader hoaDonHeader;
        List<CTHD> cthds = new ArrayList<>();

        public Builder addHoaDonHeader(String maHD, String tenKH, String ngayBan) {
            hoaDonHeader = new HoaDonHeader(maHD,tenKH, ngayBan);
            return this;
        }

        public Builder addCTHD(String sP, int sl, double donGia, double chietKhau) {
            cthds.add(new CTHD(sP, sl, donGia, chietKhau));
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }

}
