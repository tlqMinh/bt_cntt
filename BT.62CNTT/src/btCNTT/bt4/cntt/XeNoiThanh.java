package btCNTT.bt4.cntt;

import java.security.PublicKey;

public class XeNoiThanh extends ChuyenXe{
    //mã số chuyến, họ tên, số xe, số tuyến, số KM đi được, doanh thu
    int  soTuyen, soKM;

    public XeNoiThanh(String maSoChuyen, String hoTenTX, String soXe, int doanhThu, int soTuyen, int soKM) {
        super(maSoChuyen, hoTenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        return "XeNoiThanh{" +
                ", maSoChuyen='" + maSoChuyen + '\'' +
                ", hoTenTX='" + hoTenTX + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }
}
