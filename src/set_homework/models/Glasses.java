package set_homework.models;

import java.util.Objects;

public class Glasses implements Comparable<Glasses> {
    private String type;
    private String brand;
    private String gender;

    public Glasses(String type, String brand, String gender) {
        if (type == null || brand == null || gender == null){
            throw new IllegalArgumentException("Glasses is not properly initialized");
        }
        this.type = type;
        this.brand = brand;
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glasses glasses = (Glasses) o;
        return Objects.equals(type, glasses.type) &&
                Objects.equals(brand, glasses.brand) &&
                Objects.equals(gender, glasses.gender);
    }

    @Override
    public int compareTo(Glasses glasses) {
        int temp = this.type.compareTo(glasses.type);
        if (temp == 0) {
            temp = this.brand.compareTo(glasses.brand);
            if (temp == 0) {
                temp = this.gender.compareTo(glasses.gender);
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        return "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", gender='" + gender + '\'';
    }
}
