package example_1006;

import java.util.HashMap;

public class AlphabetCount {

    boolean isAlphabet(char input) {
        if (input <= 90 && input >= 65 || input >= 97 && input <= 122) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Map => key, value

        //String repoAddr = "https://github.com/yejinstar/git_exercise_push";
        //HashMap<String, String> alphabetCount = new HashMap<>();

        String repoAddr = "aaabbbcc123!!dddeeffghijkkllll";

        AlphabetCount alphabetCount = new AlphabetCount();

        for (int i = 0; i < repoAddr.length(); i++) {

            System.out.println(alphabetCount.isAlphabet(repoAddr.charAt(i)));

        }


    }
}
