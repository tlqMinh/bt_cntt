package behavioral.observer.BaiTapA5;

public class TaiKhoan implements ATM.I_TaiKhoanATM{
    ATM atm;
    String ten;
    int soDu;

    public TaiKhoan(String ten, int soDu) {
        this.ten = ten;
        this.soDu = soDu;
    }
    public void duaThe(ATM atm){
        atm.attach(this);
    }
    public void rutThe(ATM atm){
        atm.detach(this);
    }
    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if(soDu > soTienRut) return true;
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean kiemTra) {
        if(!kiemTra){
            System.out.println("Khong thanh cong");
        }else{
            System.out.println("Tai Khoan: " + ten + "\n" +
                    "So du:" + soDu +"\n" +
                    "So tien rut: " + soTienRut + "\n"
                    );
            soDu -= soTienRut;
            System.out.println("So tien con lai: "+soDu);
        }
    }
}
