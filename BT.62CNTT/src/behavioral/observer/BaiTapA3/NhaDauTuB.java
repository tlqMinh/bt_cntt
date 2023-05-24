package behavioral.observer.BaiTapA3;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia{
    TiGia t;

    public NhaDauTuB(TiGia t) {
        this.t = t;
        t.attach(this);
    }

    public void huyDangKy(TiGia t){
        t.detach(this);
    }

    @Override
    public void update(float delta) {
        if(delta >0){
            System.out.println("B: Bán ra");
        }else {
            System.out.println("B: Mua vào");
        }
    }
}
