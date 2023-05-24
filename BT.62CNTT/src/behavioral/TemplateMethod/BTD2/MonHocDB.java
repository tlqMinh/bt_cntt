package behavioral.TemplateMethod.BTD2;

public class MonHocDB extends EntityDB<MonHoc>{
    @Override
    protected MonHoc findByID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).maMH == id)
                return  list.get(i);
        }
        return null;
    }

    @Override
    protected int getId(MonHoc monHoc) {
        return monHoc.maMH;
    }
}
