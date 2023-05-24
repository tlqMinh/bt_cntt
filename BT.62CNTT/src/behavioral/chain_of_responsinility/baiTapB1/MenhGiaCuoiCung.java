package behavioral.chain_of_responsinility.baiTapB1;

public class MenhGiaCuoiCung implements IRutTien{
    int menhGiaCuoiCung;

    public MenhGiaCuoiCung(int menhGiaCuoiCung) {
        this.menhGiaCuoiCung = menhGiaCuoiCung;
    }

    @Override
    public IRutTien menhGiaKeTiep(IRutTien menhGiaKeTiep) {
        return null;
    }

    @Override
    public String rutTien(int soTien) {
        int soTo = soTien / menhGiaCuoiCung;
        if(soTo > 0){
            return soTo + " tờ mệnh giá " + menhGiaCuoiCung;
        }
        return "Ra ngân hàng khác rút";
    }
}
