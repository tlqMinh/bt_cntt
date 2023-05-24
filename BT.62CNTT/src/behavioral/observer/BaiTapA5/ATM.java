package behavioral.observer.BaiTapA5;

public class ATM {
    private I_TaiKhoanATM taiKhoanATM;

    public void attach(I_TaiKhoanATM taiKhoanATM){
        this.taiKhoanATM = taiKhoanATM;
    }
    public void detach(I_TaiKhoanATM taiKhoanATM){
        this.taiKhoanATM = null;
    }
    private boolean kiemTraTienRut(int soTienRut){
        return taiKhoanATM.kiemTraSoDu(soTienRut);
    }

    public void rutTien(int soTienRut){
        taiKhoanATM.nhanThongBao(soTienRut, kiemTraTienRut(soTienRut));
    }
    public static interface I_TaiKhoanATM{
        boolean kiemTraSoDu(int soTienRut);
        void nhanThongBao(int soTienRut, boolean kiemTra);
    }

}
