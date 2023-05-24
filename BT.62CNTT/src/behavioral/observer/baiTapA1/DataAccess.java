package behavioral.observer.baiTapA1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess<MonHoc> {
    List<MonHoc> list = new ArrayList<>();
    Stream<List<MonHoc>> stream;

    public DataAccess(Stream<List<MonHoc>> stream) {
        this.stream = stream;
    }
    public void addData(MonHoc monHoc){
        list.add(monHoc);
        stream.addEvent(list);
    }
    public void deleteData(MonHoc monHoc){
        list.remove(monHoc);
    }
    public void updateData(){

    }
}
