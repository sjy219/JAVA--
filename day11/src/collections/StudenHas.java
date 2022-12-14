package collections;

import java.util.Objects;

public class StudenHas {
    private String name;
    private int age;

    public StudenHas() {
    }

    public StudenHas(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudenHas studenHas = (StudenHas) o;
        return age == studenHas.age && Objects.equals(name, studenHas.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
