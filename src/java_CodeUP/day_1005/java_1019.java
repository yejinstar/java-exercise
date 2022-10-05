package java_CodeUP.day_1005;

import java.util.Scanner;

public class java_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.next().split("\\.");

        int[] date = new int[3];

        date[0] = Integer.parseInt(input[0]);
        date[1] = Integer.parseInt(input[1]);
        date[2] = Integer.parseInt(input[2]);

        System.out.printf("%04d.%02d.%02d",date[0],date[1],date[2]);

    }

}
