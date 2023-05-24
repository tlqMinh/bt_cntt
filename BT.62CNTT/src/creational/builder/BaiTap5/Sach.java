package creational.builder.BaiTap5;

import java.util.ArrayList;
import java.util.List;

public class Sach {
    private String tenSach, tacGia;
    private int soTrang;
    private List<String> chapters = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Tiêu đề sách: ")
                .append(tenSach)
                .append("\nSố trang: ")
                .append(soTrang)
                .append("\nTác giả: ")
                .append(tacGia)
                .append("\nChương: ");
                for(String c: chapters);
                s.append("\n").append(chapters);
        return s.toString();
    }

    private Sach(Builder b){
        soTrang = b.soTrang;
        tenSach = b.tenSach;
        tacGia = b.tacGia;
        chapters = b.chapters;
    }


    public static class Builder{
        List<String> chapters;
        String tenSach, tacGia;
        int soTrang;

        public Builder addChapter(List<String> chapters){
            this.chapters = chapters;
            return this;
        }

        public Builder addTacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }

        public Builder addTenSach(String tenSach){
            this.tenSach = tenSach;
            return this;
        }

        public Builder addSoTrang(int soTrang){
            this.soTrang = soTrang;
            return this;
        }

        public Sach build(){
            return new Sach(this);
        }
    }
}
