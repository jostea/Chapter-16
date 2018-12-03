package HomeWork16_18;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReversList {
    public static void main(String[] args) {
        List<Character> listOfChar = new LinkedList<>();

        listOfChar.add('!');
        listOfChar.add('@');
        listOfChar.add('#');
        listOfChar.add('$');
        listOfChar.add('%');
        listOfChar.add('^');
        listOfChar.add('&');
        listOfChar.add('*');
        listOfChar.add('(');
        listOfChar.add(')');

//        Collections.reverse(listOfChar);
//        System.out.println(listOfChar);


        List<Character> reversListOfChar = new LinkedList<>();
        while (!listOfChar.isEmpty()) {
            reversListOfChar.add(((LinkedList<Character>) listOfChar).getLast());
            ((LinkedList<Character>) listOfChar).removeLast();
        }
        reversListOfChar.forEach(System.out::println);
    }
}
