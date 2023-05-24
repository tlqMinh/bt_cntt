package behavioral.chain_of_responsinility.DoVeSo;

public class Giai5So implements IDoVeSo{

    IDoVeSo giaiThuong5so;

    String tenGiai, boSoTrung;

    public Giai5So(String tenGiai, String boSoTrung) {
        this.tenGiai = tenGiai;
        this.boSoTrung = boSoTrung;
    }

    @Override
    public String doVS(String maSo) {
        if(boSoTrung.endsWith(maSo))
            return "Bạn đã trúng "+tenGiai;
        maSo = maSo.substring(1);
        return giaiThuong5so.doVS(maSo);
    }

    @Override
    public IDoVeSo giaiThapHon(IDoVeSo iDoVeSo) {
        this.giaiThuong5so = iDoVeSo;
        return iDoVeSo;
    }
}
