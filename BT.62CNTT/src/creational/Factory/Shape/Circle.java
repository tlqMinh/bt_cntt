package creational.Factory.Shape;

public class Circle extends Shape{
    @Override
    void brush() {

    }

    @Override
    void paper() {

    }

    @Override
    void frame() {

    }

    @Override
    public void draw() {
        builder.append("In hình tròn");
    }
}
