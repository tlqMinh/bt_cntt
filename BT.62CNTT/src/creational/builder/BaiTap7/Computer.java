package creational.builder.BaiTap7;

public class Computer {
    String CPU, RAM, storage, screen;

    public Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.screen = builder.screen;
    }

    @Override
    public String toString() {
        return "Computer: " +"\n"+
                "CPU: " + CPU + "\n" +
                "RAM: "  + RAM + "\n" +
                "storage: " + storage + "\n" +
                "screen: " + screen + "\n";
    }

    public static class Builder{
        String CPU, RAM, storage, screen;

        public Builder buildCPU(String CPU){
            this.CPU = CPU;
            return this;
        }

        public Builder buildRAM(String RAM){
            this.RAM = RAM;
            return this;
        }

        public Builder buildStorage(String storage){
            this.storage = storage;
            return this;
        }

        public Builder buildScreen(String screen){
            this.screen = screen;
            return this;
        }

        public Computer builder(){
            return new Computer(this);
        }

    }
}
