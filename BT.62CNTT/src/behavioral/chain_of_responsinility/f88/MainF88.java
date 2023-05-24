package behavioral.chain_of_responsinility.f88;

public class MainF88 {
    public static void main(String[] args) {
        IXulyVay gacCong = new NhanVienF88("Minh", "Gác cổng kim cương", 5000000);
        IXulyVay nhanVienQuen = new NhanVienF88("Di", "Gác cổng Cao thủ", 8000000);
        IXulyVay truongPhong = new NhanVienF88("Kiên", "Gác cổng Đại cao thủ", 15000000);
        IXulyVay phoGiamDoc = new NhanVienF88("Ly", "Gác cổng Thách đấu", 30000000);
        IXulyVay giamDoc = new NhanVienF88("Ming","Dưới 1 người trên vạn người", 500000000);

        gacCong.capCaoHon(nhanVienQuen)
                .capCaoHon(truongPhong)
                .capCaoHon(phoGiamDoc)
                .capCaoHon(giamDoc);
        System.out.println(gacCong.xuLyKhoanVay(300000));
    }
}
