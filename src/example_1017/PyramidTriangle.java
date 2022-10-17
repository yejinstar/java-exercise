package example_1017;

import java.util.Scanner;

public class PyramidTriangle {

    private String letter = "*";
    public PyramidTriangle() {
    }

    public PyramidTriangle(String letter) {
        this.letter = letter;
    }

    public void printRightTriangle(int n){
        for(int i =0 ; i < n; i ++){
            for(int j = n-1-i; j >0 ;j-- ){
                System.out.print(" ");
            }

            for(int k = 0; k < 2 * i + 1 ;k++ ){
                if(k%2==0){
                    System.out.print(this.letter);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        PyramidTriangle pyramidTriangle = new PyramidTriangle("@");
        pyramidTriangle.printRightTriangle(input);
    }
}
