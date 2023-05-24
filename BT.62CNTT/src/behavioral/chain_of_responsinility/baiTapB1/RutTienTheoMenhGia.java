package behavioral.chain_of_responsinility.baiTapB1;

public class RutTienTheoMenhGia implements IRutTien {
    IRutTien menhGiaKeTiep;
    int menhGia, soTo = 0, soDu;

    public RutTienTheoMenhGia( int menhGia) {
        this.menhGia = menhGia;
    }
    @Override
    public String rutTien(int soTien) {
        soTo = soTien / menhGia;
        soDu = soTien % menhGia;
        if(soTo>0){
            System.out.println(soTo + " tờ mệnh giá " + menhGia);
            return menhGiaKeTiep.rutTien(soDu);
        }
        return menhGiaKeTiep.rutTien(soDu);
    }

    @Override
    public IRutTien menhGiaKeTiep(IRutTien menhGiaKeTiep) {
        this.menhGiaKeTiep = menhGiaKeTiep;
        return menhGiaKeTiep;
    }
}
