package behavioral.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainIterator {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(1);
        Iterator<Integer> ite = arrayList.iterator();

        while(ite.hasNext())
            System.out.println(ite.next());
    }
}
