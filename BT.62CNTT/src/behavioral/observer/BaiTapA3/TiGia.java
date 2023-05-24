package behavioral.observer.BaiTapA3;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<I_TheoDoiTiGia> observer = new ArrayList<I_TheoDoiTiGia>();

    public void attach(I_TheoDoiTiGia o){
        observer.add(o);
    }
    public void detach(I_TheoDoiTiGia o){
        observer.remove(o);
    }

    public void notifyTiGia(float delta){
        for(I_TheoDoiTiGia o : observer){
            o.update(delta);
        }
    }
    static public interface I_TheoDoiTiGia{
        void update(float delta);
    }
}
