package HomeWork16_15;

import java.util.Objects;

public class Colors {
    private String color;
    private Colors colors;

    public Colors(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Colors)) return false;
        Colors colors = (Colors) o;
        return Objects.equals(color, colors.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Color: " + color;
    }
}
