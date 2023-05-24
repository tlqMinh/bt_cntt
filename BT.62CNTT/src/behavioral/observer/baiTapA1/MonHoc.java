package behavioral.observer.baiTapA1;

public class MonHoc {
    String maMH, tenMH;
    int soTC;

    public MonHoc(String maMH, String tenMH, int soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "Mã môn học: " + maMH+"\n"+
                "Tên môn học: "+ tenMH +"\n"+
                "Số tín chỉ: "+soTC+"\n";
    }
}
