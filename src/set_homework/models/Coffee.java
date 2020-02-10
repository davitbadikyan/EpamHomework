package set_homework.models;

import java.util.Objects;

public class Coffee implements Comparable<Coffee> {
    private String color;
    private String type;
    private String country;

    public Coffee(String color, String type, String country) {
        if (color == null || type == null || country == null){
            throw new IllegalArgumentException("Coffee is not properly initialized");
        }
        this.color = color;
        this.type = type;
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Objects.equals(color, coffee.color) &&
                Objects.equals(type, coffee.type) &&
                Objects.equals(country, coffee.country);
    }

    @Override
    public int compareTo(Coffee coffee) {
        int temp = this.type.compareTo(coffee.type);
        if (temp == 0) {
            temp = this.color.compareTo(coffee.color);
            if (temp == 0) {
                temp = this.country.compareTo(coffee.country);
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", country='" + country + '\'';
    }
}
