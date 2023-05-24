package creational.Factory.Shape;

public abstract class Shape {
    StringBuilder builder = new StringBuilder();
    abstract void brush();
    abstract void paper();
    abstract void frame();

    public abstract void draw();

    @Override
    public String toString() {
        return builder.toString();
    }
}
