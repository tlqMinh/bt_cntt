package creational.Factory.Shape;

public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory(){}

    public static ShapeFactory getInstance(){
        if(instance == null)
            instance = new ShapeFactory();
        return instance;
    }

    public Shape getShape(ShapeType shapeType){
        if(shapeType == null){
            return null;
        }
        return null;
    }
}
