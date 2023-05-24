package behavioral.TemplateMethod.BTD2;

public class SinhVien {
    String tenSV, ngaySinh, queQuan;
    int maSV;

    public SinhVien(int maSV, String tenSV, String ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    @Override
    public String toString() {
        return "Sinh Vien: " + tenSV + "\n"
                + "MSSV: "+ maSV + "\n"
                + "Ngày sinh: " + ngaySinh + "\n"
                + "Quê quán: " + queQuan + "\n";
    }
}
