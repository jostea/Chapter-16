package HomeWork16_13;

import java.util.Objects;

public class User implements Comparable<User> {
    private String firstName;
    private String secondName;
    private int age;

    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() &&
                Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getSecondName(), user.getSecondName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName());
    }

    @Override
    public String toString() {
        return "First name: " + getFirstName() + "|" +
                "Second name: " + getSecondName() + "|" +
                " Age: " + getAge();
    }


    @Override
    public int compareTo(User o) {
        return this.firstName.compareTo(o.firstName);
    }
}
