package example_1005;

public class Calculator {
    int a, b;

    public Calculator(){

    }

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double plus(){
        return a+b;
    }
    public double minus(){
        return a-b;
    }
    public double multiple(){
        return a*b;
    }
    public double divide(){
        return (double)a/(double)b;
    }
}