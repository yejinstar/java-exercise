package example_1006;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();

        Set<Character> set1 = new HashSet<>();

        for (int i = 0 ; i < 10 ; i++){
            char alphabet = alphabetGenerator.generate(0);
            set1.add(alphabet);
        }

        System.out.println(set1);
    }
}
