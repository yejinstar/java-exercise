package example_1005;

public class RandomCalculator {

    private int a,b;

    public RandomCalculator() {}

    public RandomCalculator(int a) {
        this.a = a;
        this.b = (int) (Math.random() * 10);
    }

    public double plus() {
        return a + b;
    }

    public double minus() {
        return a - b;
    }

    public double multiple() {
        return a * b;
    }

    public double divide() {

        if (b==0){
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
            return 0;
        }else {
            return (double) a / (double) b;
        }
    }
}

