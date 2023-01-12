public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        //System.out.println(shape);
        Circle circle = new Circle();
        circle = new Circle(10);
        //System.out.println(circle);
        Rectangle rectangle = new Rectangle();
        rectangle = new Rectangle(3, 9);
        //System.out.println(rectangle);
        Square square = new Square();
        square = new Square(20, "Blue",true);
        System.out.println(square);
    }
}