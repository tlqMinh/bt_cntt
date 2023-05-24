package behavioral.TemplateMethod.BTD2;

public class MonHoc {
    int maMH, soTC;
    String tenMH;

    public MonHoc(int maMH, int soTC, String tenMH) {
        this.maMH = maMH;
        this.soTC = soTC;
        this.tenMH = tenMH;
    }

    public int getMaMH() {
        return maMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public String getTenMH() {
        return tenMH;
    }

    @Override
    public String toString() {
        return "Môn học: " + tenMH + " maMH: " + maMH + "\n"
                + " soTC: " + soTC;
    }
}
