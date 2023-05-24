package behavioral.observer.BaiTapA5;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan tk1 = new TaiKhoan("Minh",5000000);
        tk1.duaThe(atm);
        atm.rutTien(500000);
        tk1.rutThe(atm);
    }
}
