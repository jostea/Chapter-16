package HomeWork16_14;

import java.util.*;

public class FindWords {

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);

    }


    private static void createMap(Map<String, Integer> map) {
        Scanner input = new Scanner(System.in);
        String[] tokens = input.nextLine().toLowerCase().split("");
        for (String word : tokens) {

            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else
                map.put(word, 1);
            map.remove(" ");
        }


    }

    public static void displayMap(Map<String, Integer> map) {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);
    }
}
