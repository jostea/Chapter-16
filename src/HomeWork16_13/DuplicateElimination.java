package HomeWork16_13;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateElimination {

    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>();

        userSet.add(new User("Jostea", "Schneider", 22));
        userSet.add(new User("Jostea", "Schneider", 22));
        userSet.add(new User("Jostea", "FDSFwf", 50));
        userSet.add(new User("Andry", "Cate", 22));
        userSet.add(new User("Andry", "Cate", 22));
        userSet.add(new User("Jostea", "Ambrams", 20));
        userSet.add(new User("Gorge", "Karatist", 18));


        userSet.forEach(System.out::println);
    }
}
