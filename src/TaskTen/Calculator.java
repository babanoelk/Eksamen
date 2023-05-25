package TaskTen;

public class Calculator {

    private double result = 0;

    public void add(double x) {
        result += x;
    }

    public void subtract(double x) {
        result -= x;
    }

    public void clear() {
        result = 0;
    }

    public void add(double[] numbers) {
        for (double d : numbers) {
            result += d;
        }
    }


    public double getResult() {
        return result;
    }
}
