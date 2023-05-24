package behavioral.chain_of_responsinility.baiTapB3;

public interface ITinhTienDien {
    int soKiDien(int soDien);
    ITinhTienDien bacTiepTheo(ITinhTienDien bacTiepTheo);
}
