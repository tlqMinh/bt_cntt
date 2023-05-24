package creational.builder.BaiTap5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> chapters = new ArrayList<>();
        chapters.add("Chương 1: Giới thiệu");
        chapters.add("Chương 2: Các nhà thơ tiêu biểu");
        Sach.Builder builder = new Sach.Builder();
        Sach sach1 = builder.addTenSach("Thi Nhân Việt Nam").addTacGia("HoàiThanh").addSoTrang(756).addChapter(chapters).build();
        System.out.println(sach1.toString());
    }
}
