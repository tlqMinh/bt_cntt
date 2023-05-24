package behavioral.chain_of_responsinility.f88;

public class NhanVienF88 implements IXulyVay{
    IXulyVay capCaoHon;
    String ten, chucVu;
    int hanMucChoVay;

    public NhanVienF88(String ten, String chucVu, int hanMucChoVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucChoVay = hanMucChoVay;
    }

    @Override
    public String xuLyKhoanVay(int tienVay) {
        if(tienVay <= hanMucChoVay){
            return chucVu + " " + ten + "" + " xu ly khoan vay";
        }
        return capCaoHon.xuLyKhoanVay(tienVay);
    }

    @Override
    public IXulyVay capCaoHon(IXulyVay capCaoHon) {
        this.capCaoHon = capCaoHon;
        return capCaoHon;
    }
}
