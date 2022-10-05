package example_1005.Calc1;

public class Calculator {

    NumberGenerator numberGenerator;
    private int baseNum;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Calculator(NumberGenerator numberGenerator, int baseNum) {
        this.numberGenerator = numberGenerator;
        this.baseNum = baseNum;
    }

    public void plus(int num){
        System.out.println(num + numberGenerator.generate(baseNum));
    }
}
