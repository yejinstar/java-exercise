package example_1005.Calc1;

public class Main {
    public static void main(String[] args) {
        Calculator randCalculator = new Calculator(new RandomNumberGenerator());
        randCalculator.plus(10);

        Calculator speciCalculator = new Calculator(new SpecificNumberGenerator());
        speciCalculator.plus(30);

        Calculator randCalculator1 = new Calculator(new RandomNumberGenerator(),20);
        randCalculator1.plus(10);

        Calculator speciCalculator1 = new Calculator(new SpecificNumberGenerator(),20);
        speciCalculator1.plus(30);
    }
}
