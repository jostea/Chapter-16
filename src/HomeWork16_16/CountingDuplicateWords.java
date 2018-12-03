package HomeWork16_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingDuplicateWords {
    public static void main(String[] args) {
        Map<String, Integer> mapWords = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().toLowerCase().split(" ");


        for (String word : words) {
            if (word.contains("!")) {
                word = word.substring(0, word.indexOf("!"));
            }
            if (word.contains(".")) {
                word = word.substring(0, word.indexOf("."));
            }
            if (word.contains("?")) {
                word = word.substring(0, word.indexOf("?"));
            }
            if (mapWords.containsKey(word)) {
                int i = mapWords.get(word);
                mapWords.put(word, i + 1);
            } else mapWords.put(word, 1);


        }

        for (Map.Entry<String, Integer> entry : mapWords.entrySet()) {
            System.out.println("The " + entry.getKey() + " was found:  " + entry.getValue());
        }

    }
}
