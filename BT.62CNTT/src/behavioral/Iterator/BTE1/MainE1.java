package behavioral.Iterator.BTE1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainE1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        Iterator<Integer> ite = arrayList.iterator();
        ite.next();
    }
}
