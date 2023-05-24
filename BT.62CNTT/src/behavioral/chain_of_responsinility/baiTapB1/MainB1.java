package behavioral.chain_of_responsinility.baiTapB1;

public class MainB1 {
    public static void main(String[] args) {
        IRutTien rut500 = new RutTienTheoMenhGia(500);
        IRutTien rut200 = new RutTienTheoMenhGia(200);
        IRutTien rut100 = new RutTienTheoMenhGia(100);
        IRutTien rut50 = new RutTienTheoMenhGia(50);
        IRutTien rut10 = new RutTienTheoMenhGia(10);
        IRutTien rut1 = new MenhGiaCuoiCung(1);

        rut500.menhGiaKeTiep(rut200)
                .menhGiaKeTiep(rut100)
                .menhGiaKeTiep(rut50)
                .menhGiaKeTiep(rut10)
                .menhGiaKeTiep(rut1);
        System.out.println(rut500.rutTien(1251));


    }
}
