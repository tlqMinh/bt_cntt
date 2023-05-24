package behavioral.observer.BaiTapA4;

import java.util.ArrayList;
import java.util.List;

public class LopB implements Topic.I_ThongTin{
    Topic topic;
    List<String> dsThongTin = new ArrayList<>();
    public LopB(Topic topic){
        this.topic = topic;
        topic.attach(this);
    }
    public void huyDangKy(){
        topic.detach(this);
    }
    @Override
    public void update(String tt) {

        dsThongTin.add(tt);
        if(tt.length() > 0) {
            System.out.println("B: nhận "+ tt);
        }else {
            System.out.println("B: không update");
        }

    }
}
