package creational.builder.BaiTap2;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder();
        builder.addString("Hello ")
                .addString("world!\n")
                .addFloat(3.14f)
                .addBool(true);
        String result = builder.toString();
        System.out.println(result);
    }
}
