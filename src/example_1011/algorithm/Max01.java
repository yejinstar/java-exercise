package example_1011.algorithm;

public class Max01 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        int max = arr[0];
        int idx = 0;
        for (int i = 1 ; i < arr.length;i++) {
            if (max < arr[i]){
                max = arr[i];
                idx = i;
            }
        }
        System.out.println("max : " + max);
        System.out.println("idx : " + idx);
    }
}
