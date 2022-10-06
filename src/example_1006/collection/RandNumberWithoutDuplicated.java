package example_1006.collection;

import example_1005.Calc1.NumberGenerator;
import example_1005.Calc1.RandomNumberGenerator;

import java.util.HashSet;
import java.util.Set;

public class RandNumberWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> set1 = new HashSet<>();

        for (int i = 0 ; i < 50 ; i++){
            int r = randomNumberGenerator.generate(20);
            set1.add(r);
        }

        System.out.println(set1);
    }
}
