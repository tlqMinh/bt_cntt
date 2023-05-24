package behavioral.observer.BaiTapA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<I_ThongTin> observer = new ArrayList<I_ThongTin>();
    List<String> tins = new ArrayList<>();

    public void attach(I_ThongTin o) {observer.add(o);}
    public void detach(I_ThongTin o){observer.remove(o);}

    public void notifyThongTin(String tt){
        for(I_ThongTin o : observer){
            o.update(tt);
        }
    }

    public void taoMoi(String tt){
        tins.add(tt);
        notifyThongTin(tt);
    }
    static public interface I_ThongTin{
        void update(String tt);
    }
}
