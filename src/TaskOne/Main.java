package TaskOne;

public class Main {

    public static void main(String[] args) {

        Square square1 = new Square(10.3, 10.8);
        Circle cirle1 = new Circle(10.5);

        System.out.println(square1.calculateArea());
        System.out.println(cirle1.calculateArea());

        Shapes shapes = new Shapes();

        shapes.addShape(square1);
        System.out.println(shapes.totalArea());
        shapes.addShape(cirle1);
        System.out.println(shapes.totalArea());
    }

}
