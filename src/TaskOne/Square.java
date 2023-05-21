package TaskOne;

public class Square implements Shape {

    private double height;
    private double length;

    public Square(double height, double length) {
        this.height = height;
        this.length = length;
    }


    public double calculateArea() {
        return height * length;
    }
}
