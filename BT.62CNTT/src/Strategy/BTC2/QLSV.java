package Strategy.BTC2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    List<SinhVien> svs = new ArrayList<>();
    ISoSanh<SinhVien> soSanh;

    public void sapXep(){
        svs.sort(((o1, o2) -> soSanh.soSanh(o1, o2)));
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public  void inDS(){
        for (SinhVien sinhVien:svs) sinhVien.toString();
    }

    public List<SinhVien> getSvs() {
        return svs;
    }

    public void setSvs(List<SinhVien> svs) {
        this.svs = svs;
    }
}

