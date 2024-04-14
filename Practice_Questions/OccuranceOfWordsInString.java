package Practice_Questions;

import java.util.*;

public class OccuranceOfWordsInString {

    public static void main(String args[]) {
        String s = "he is a boy she is a girl";

        String[] words = s.split(" ");
        HashMap<String, Integer> hp = new HashMap<>();

        for (String word : words) {
            if (hp.containsKey(word)) {
                hp.put(word, hp.get(word) + 1);
            } else {
                hp.put(word, 1);

            }

        }
        System.out.println(hp);
    }

}
