package example_1005;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10,20);

//        calc.plus();
//        calc.minus();
//        calc.multiple();
//        calc.divide();

        RandomCalculator randCalc = new RandomCalculator(10);

        randCalc.plus();
        randCalc.minus();
        randCalc.multiple();
        randCalc.divide();
    }

}
