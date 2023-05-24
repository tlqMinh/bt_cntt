package btCNTT.bt5.cntt;

public abstract class CaNhan {
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public String hienThiTT() {
        return "Họ tên: " + hoTen +
                "" +
                "\nTuổi: " + tuoi +
                "\nĐịa chỉ: " + diaChi +
                "\nSdt: " + sdt;
    }
}
