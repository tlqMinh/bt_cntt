package creational.builder.BaiTap1;

public class Main {
    public static void main(String[] args) {
        HoaDon.Builder hd1 = new HoaDon.Builder();
        HoaDon don = hd1.addHoaDonHeader("001","Quang Minh","07-06-2022")
                .addCTHD("Khô gà lá chanh",100,135000,3000)
                .build();
        System.out.printf(don.toString());
    }
}
