package creational.singleton;

public class Main_SingleTon {
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();
        s1.tang();
        System.out.println("s1: " + s1.count);
        s1.tang();
        s2.tang();
        System.out.println("s2: "+s2.count);
        System.out.println("s1: "+s1.count);
    }

}
