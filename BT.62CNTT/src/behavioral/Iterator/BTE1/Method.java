package behavioral.Iterator.BTE1;

public class Method {
    int [] arrayList;

    public Method(int[] arrayList) {
        this.arrayList = arrayList;
    }

    public int getItem(int i){
        return arrayList[i];
    }
    public int count(){
        return arrayList.length;
    }

}
