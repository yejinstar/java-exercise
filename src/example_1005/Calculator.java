package example_1005;

public class Calculator {
    private int a, b;

    public Calculator() {

    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        System.out.println(a+b);
    }

    public void minus() {
        System.out.println(a-b);
    }

    public void multiple() {
        System.out.println(a*b);
    }

    public void divide() {
        System.out.println((double)a/b);
    }
}