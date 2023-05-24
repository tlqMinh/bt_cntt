package behavioral.TemplateMethod.BTD2;

public class SinhVienDB extends EntityDB<SinhVien> {
    @Override
    protected SinhVien findByID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).maSV == id)
                return list.get(i);
        }
        return null;
    }

    @Override
    protected int getId(SinhVien sinhVien) {
        return sinhVien.maSV;
    }
}
