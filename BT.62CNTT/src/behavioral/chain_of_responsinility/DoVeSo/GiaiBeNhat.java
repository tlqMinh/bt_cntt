package behavioral.chain_of_responsinility.DoVeSo;

import java.util.ArrayList;
import java.util.List;

public class GiaiBeNhat implements IDoVeSo{
    String tenGiai;

    String boSoTrung;

    public GiaiBeNhat(String tenGiai, String boSoTrung) {
        this.tenGiai = tenGiai;
        this.boSoTrung = boSoTrung;
    }

    @Override
    public String doVS(String maSo) {
        if(boSoTrung.endsWith(maSo))
            return "Trúng " + tenGiai;
        return "Trúng gió r";
    }

    @Override
    public IDoVeSo giaiThapHon(IDoVeSo iDoVeSo) {
        return null;
    }
}
