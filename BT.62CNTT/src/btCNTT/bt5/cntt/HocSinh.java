package btCNTT.bt5.cntt;

public class HocSinh extends  CaNhan{
    String lop, nangKhieu;

    public HocSinh(String hoTen, int tuoi, String diaChi, String sdt, String lop, String nangKhieu) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    @Override
    public String hienThiTT() {
        return super.hienThiTT() +
                "\nLớp: " + lop +
                "\nNăng khieu" +
                nangKhieu;
    }
}
