package TaskOne;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    private List<Shape> shapeList;

    public Shapes() {
        shapeList = new ArrayList<>();
    }


    public void addShape(Shape s) {
        shapeList.add(s);
    }

    public double totalArea() {
        double total = 0;
        for (Shape s : shapeList) {
            total += s.calculateArea();
        }
        return total;
    }
}
