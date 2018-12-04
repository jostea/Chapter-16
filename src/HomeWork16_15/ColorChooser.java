package HomeWork16_15;


import java.util.*;

public class ColorChooser {


    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String[] name2 = input.nextLine().split(" ");
//        String word = input.nextLine();
//
//        int count = 0;
//        String word2 = "";
//        for (String s : name2) {
//            if (s.equalsIgnoreCase(word)) {
//                word2 = s;
//                count++;
//            }
//        }
//        System.out.println(word2 + " was found " + count);

//        Set<Colors> list = new TreeSet<>((o1, o2) -> o1.getColor().compareTo(o2.getColor()));
        Map<String, Colors> mapColor = new HashMap<>();

        mapColor.put("Blue", new Colors("Blue"));
        mapColor.put("Red", new Colors("Red"));
        mapColor.put("Abstract", new Colors("Abstract"));
        mapColor.put("Green", new Colors("Green"));
        mapColor.put("Pink", new Colors("Pink"));
        mapColor.put("Pink", new Colors("Pink"));
        mapColor.put("Pink", new Colors("Pink"));

        for (Map.Entry<String, Colors> map : mapColor.entrySet()) {
            System.out.println("Key " + map.getKey() + ": Value " + map.getValue().getColor());
        }

    }

}
