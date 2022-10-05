package example_1005;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10,20);

        System.out.println(calc.plus());
        System.out.println(calc.minus());
        System.out.println(calc.multiple());
        System.out.println(calc.divide());
    }

}
