package example_1004;

import java.util.Scanner;

public class CurrencyTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("금액 : ");
        int money = sc.nextInt();

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        System.out.println(curr50000+"원: "+money/curr50000+"개, 나머지: "+money%curr50000);
        money = money % 50000;
        System.out.println(curr10000+"원: "+money/curr10000+"개, 나머지: "+money%curr10000);
        money = money % 10000;
        System.out.println(curr5000+"원: "+money/curr5000+"개, 나머지: "+money%curr5000);
        money = money % 5000;
        System.out.println(curr1000+"원: "+money/curr1000+"개, 나머지: "+money%curr1000);
        money = money % 1000;
        System.out.println(curr500+"원: "+money/curr500+"개, 나머지: "+money%curr500);
        money = money % 500;
        System.out.println(curr100+"원: "+money/curr100+"개, 나머지: "+money%curr100);
        money = money % 100;
        System.out.println(curr50+"원: "+money/curr50+"개, 나머지: "+money%curr50);
        money = money % 50;
        System.out.println(curr10+"원: "+money/curr10+"개, 나머지: "+money%curr10);
        money = money % 10;
    }
}
