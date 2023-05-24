package behavioral.observer.baiTapA1;

import java.util.ArrayList;
import java.util.List;

public class Stream<T>{
    List<StreamListener> listeners = new ArrayList<>();
    public  void listen(StreamListener listener) {
        listeners.add(listener);
    }
    public void addEvent(T t){
        for(var listener: listeners){
            listener.handle(t);
        }
    }
    public static interface StreamListener<T>{
        void handle(T t);
    }
}