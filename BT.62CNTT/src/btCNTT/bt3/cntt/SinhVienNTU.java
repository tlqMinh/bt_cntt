package btCNTT.bt3.cntt;

public abstract class SinhVienNTU{
    String hoTen, nganh;
    public SinhVienNTU(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public void xuat(){
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nganh hoc: "+ nganh);
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public String gethocLuc(){
        double diem = getDiem();
        if(diem < 5) return "yếu";
        else if (diem < 6.5) return "trung Bình";
        else if (diem < 7.5) return "khá";
        else if (diem < 9) return "giỏi";
        return "xuất sắc";
    }

}
