package btCNTT.bt4.cntt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> dscx = new ArrayList<ChuyenXe>();
    public void them(ChuyenXe cx) {
        for(ChuyenXe c:dscx)
            if(c.maSoChuyen == cx.maSoChuyen) return;
        dscx.add(cx);
    }

    public void xuatDS() {
        for (ChuyenXe c : dscx)
            System.out.println(c.toString());
    }

    public int doanhThuNgoaiThanh() {
        int tong = 0;
        for (ChuyenXe xe : dscx) {
            if (xe instanceof XeNgoaiThanh) tong += xe.doanhThu;
        }
            return tong;
    }
    public int doanhThuNoiThanh() {
        int tong = 0;
            for (ChuyenXe xe : dscx) {
                if (xe instanceof XeNoiThanh) tong += xe.doanhThu;
            }
            return tong;
    }

    public int tongDoanhThuHaiXe(){
        int tong = 0;
        for(ChuyenXe c : dscx){
            tong += c.getDoanhThu();
        }
        return tong;
    }

}
