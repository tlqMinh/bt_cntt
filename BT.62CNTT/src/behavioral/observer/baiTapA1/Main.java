package behavioral.observer.baiTapA1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stream<List<MonHoc>> stream = new Stream<>();
        DataAccess dataAccess = new DataAccess(stream);
        Client<List<MonHoc>> client = new Client<List<MonHoc>>(stream) {
            @Override
            public void handle(List<MonHoc> monHocs) {
                for (var mn : monHocs) {
                    System.out.println(mn.toString());
                }
            }
        };
        dataAccess.addData(new MonHoc("1","AI",3));
    }
}
