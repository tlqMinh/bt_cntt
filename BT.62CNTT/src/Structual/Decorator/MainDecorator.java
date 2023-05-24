package Structual.Decorator;

public class MainDecorator {
    public static void main(String[] args) {
         Beverage ly1 = new HouseBlend("Cà phê ");
                    ly1 = new Milk("Sữa ",ly1);
                    ly1 = new Mocha("Mocha ",ly1);

         System.out.println(ly1.getDescription());
         System.out.println("Cost " + ly1.cost());
    }
}
