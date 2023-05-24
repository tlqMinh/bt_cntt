package creational.singleton;

public class SingleTon {
    private static SingleTon instance;

    int count = 0;

    private SingleTon(){
    }

    public static SingleTon getInstance(){
        if(instance == null)
            instance = new SingleTon();
        return instance;
    }

    public void tang(){
        count++;
    }
}
