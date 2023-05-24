package btCNTT.bt3.cntt;

public class SinhVienIT extends SinhVienNTU{
    double diemJava, diemCSS, diemHTML;

    public SinhVienIT(String hoTen,String nganh, double diemCSS, double diemJava, double diemHTML){
        super(hoTen, nganh);
        this.diemCSS = diemCSS;
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem(){
        return (2*diemJava+diemCSS+diemHTML)/4;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(("Điểm: "+getDiem()));
        System.out.println("Học lực: "+gethocLuc());
    }
}
