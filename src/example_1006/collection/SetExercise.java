package example_1006.collection;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("김예진");
        set1.add("김미미");
        set1.add("김민지");
        set1.add("김민지");
        set1.add("김민지");

        System.out.println(set1);
    }
}
