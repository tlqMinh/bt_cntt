package behavioral.chain_of_responsinility.baiTapB3;

public class mainB3 {
    public static void main(String[] args) {
        ITinhTienDien bac1 = new TinhTienDien(1678, 0, 50);
        ITinhTienDien bac2 = new TinhTienDien(1734, 50, 100);
        ITinhTienDien bac3 = new TinhTienDien(2014, 100, 200);
        ITinhTienDien bac4 = new TinhTienDien(2536, 200, 300);
        ITinhTienDien bac5 = new TinhTienDien(2834, 300, 400);
        ITinhTienDien bac6 = new TinhTienDien(2927, 400,Integer.MAX_VALUE);

        bac1.bacTiepTheo(bac2)
                .bacTiepTheo(bac3)
                .bacTiepTheo(bac4)
                .bacTiepTheo(bac5)
                .bacTiepTheo(bac6);
        System.out.println("Số tiền điện là: " + bac1.soKiDien(100));
    }
}
