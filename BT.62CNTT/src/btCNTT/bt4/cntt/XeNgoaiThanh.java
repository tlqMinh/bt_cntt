package btCNTT.bt4.cntt;

public class XeNgoaiThanh extends ChuyenXe{
    //mã số chuyến, họ tên tài xê, nơi đến, số xe , số ngày, doanh thu
    String noiDen;
    int  soNgay;

    public XeNgoaiThanh(String maSoChuyen, String hoTenTX, String soXe, int doanhThu, String noiDen, int soNgay) {
        super(maSoChuyen, hoTenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    @Override
    public String toString() {
        return "XeNgoaiThanh{" +
                ", maSoChuyen='" + maSoChuyen + '\'' +
                ", hoTenTX='" + hoTenTX + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }
}
