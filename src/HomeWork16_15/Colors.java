package HomeWork16_15;

import java.util.Objects;

public  class Colors implements Comparable<Colors> {
    private String color;




    public String getColor() {
        return color;
    }

    public Colors(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Colors)) return false;
        Colors colors = (Colors) o;
        return Objects.equals(getColor(), colors.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getColor());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Colors o) {
        return this.color.compareTo(o.color);
    }
}
