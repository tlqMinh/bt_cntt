package creational.builder.BaiTap7;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .buildCPU("Intel i7 12500H")
                .buildRAM("KingsTon Fury Beast 2666MHz")
                .buildStorage("Sam Sung SSD EVO 512GB")
                .buildScreen("Monitor 15.6 inches")
                .builder();
        System.out.println(computer.toString());
    }
}
