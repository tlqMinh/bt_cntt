package Strategy.BTC2;

import java.util.ArrayList;
import java.util.List;

public class MainBTC2 {
    public static void main(String[] args) {
        QLSV ql = new QLSV();
        ql.setSoSanh(new SoSanhTheoDiem());
        ql.sapXep();
        ql.inDS();

        ql.setSoSanh(new SoSanhTheoTen());
        ql.sapXep();
        ql.inDS();
    }
}
