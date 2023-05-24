package behavioral.chain_of_responsinility.baiTapB3;

public class TinhTienDien implements ITinhTienDien{
    ITinhTienDien bacTiepTheo;
    int min, max;
    int giaTienDien;

    public TinhTienDien(int giaTienDien, int min, int max) {
        this.giaTienDien = giaTienDien;
        this.min = min;
        this.max = max;
    }

    @Override
    public int soKiDien(int soDien) {
        if(soDien <= max ){
            return (soDien - min) * giaTienDien;
        }else
            return (max - min) * giaTienDien + bacTiepTheo.soKiDien(soDien);
    }
    @Override
    public ITinhTienDien bacTiepTheo(ITinhTienDien bacTiepTheo) {
        this.bacTiepTheo = bacTiepTheo;
        return bacTiepTheo;
    }
}
