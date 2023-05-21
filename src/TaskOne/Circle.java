package TaskOne;

import static java.lang.Math.PI;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * (radius*radius);
    }
}
