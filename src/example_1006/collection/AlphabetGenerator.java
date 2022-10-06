package example_1006.collection;

public class AlphabetGenerator implements Generator<Character> {

    @Override
    public Character generate(int num) {
        int randomNum = (int) (Math.random()*26);
        char alphabet = (char) (randomNum + 65);
        return alphabet;

    }
}
