package btCNTT.bt3.cntt;

public class main {

    public static  void main(String[] args) {
        System.out.println("-------------------------WELCOME-----------------------------");
        SinhVienIT sv1 = new SinhVienIT("Quang Minh","CNTT",7,8,9);
        sv1.xuat();

        SinhVienBiz sv2 = new SinhVienBiz("Nguyễn Hoàng Duy","Kinh tế",9,9);
        sv2.xuat();
    }
}
