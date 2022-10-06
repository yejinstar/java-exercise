package example_1006.collection;

import java.util.HashMap;

public class AlphabetCount {

    public boolean isAlphabet(char input) {
        if (input <= 'Z' && input >= 'A' || input >= 'a' && input <= 'z') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Map => key, value
        //String repoAddr = "https://github.com/yejinstar/git_exercise_push";
        HashMap<String, Integer> alphabetCountMap = new HashMap<>();

        String repoAddr = "aaabbbcc123!!dddeeffghijkkllll".toUpperCase();

        AlphabetCount alphabetCount = new AlphabetCount();

        for (char c = 'A'; c <= 'Z'; c++) {
            alphabetCountMap.put(String.valueOf(c), 0);
        }
        for (int i = 0; i < repoAddr.length(); i++) {

            char c = repoAddr.charAt(i);

            if (alphabetCount.isAlphabet(c)) {
                alphabetCountMap.put(String.valueOf(c), alphabetCountMap.get(String.valueOf(c)) + 1);
            }
        }
        System.out.println(alphabetCountMap);
    }
}
