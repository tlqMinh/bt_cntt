package Strategy.BTC3;

public class c3_main {
    public static void main(String[] args) {
        GioHang gh = new GioHang();

        gh.giaTien = 2500000;
        gh.setVanChuyen(new Vc_NinjaVan());
        gh.setKhuyenMai(new KhuyenMai());
        gh.setThanhToan(new ThanhToanCOD());

        System.out.println(gh.hoaDon());
    }
}
