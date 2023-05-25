package TaskTen;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(3);
        System.out.println(calculator.getResult());

        calculator.subtract(1);
        System.out.println(calculator.getResult());

        calculator.clear();
        System.out.println(calculator.getResult());

        double[] numbers = {3,10,4};

        calculator.add(numbers);
        System.out.println(calculator.getResult());

    }
}
