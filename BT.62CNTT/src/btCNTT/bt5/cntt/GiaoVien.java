package btCNTT.bt5.cntt;

public class GiaoVien extends CaNhan{
    String monDay, toBoMon;

    public GiaoVien(String hoTen, int tuoi, String diaChi, String sdt, String monDay, String toBoMon) {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String hienThiTT() {
        return super.hienThiTT() + "\nMon day: " + monDay +
                "\nTo bo mon: " + toBoMon;
    }
}
