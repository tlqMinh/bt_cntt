package btCNTT.bt3.cntt;

public class SinhVienBiz extends SinhVienNTU{
    double diemMarketing, diemSale;

    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSale) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSale = diemSale;
    }

    @Override
    public double getDiem(){
        return (2*diemMarketing+diemSale)/3;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(("Điểm: "+getDiem()));
        System.out.println("Học lực: "+gethocLuc());
    }

}
