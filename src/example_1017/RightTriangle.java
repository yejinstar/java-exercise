package example_1017;

import java.util.Scanner;

public class RightTriangle {

    private String letter = "*";
    public RightTriangle() {
    }

    public RightTriangle(String letter) {
        this.letter = letter;
    }

    public void printRightTriangle(int n){
        for(int i =0 ; i < n; i ++){
            for(int j = 0; j <i+1;j++ ){
                System.out.print(this.letter + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        RightTriangle rightTriangle = new RightTriangle("@");
        rightTriangle.printRightTriangle(input);
    }
}
