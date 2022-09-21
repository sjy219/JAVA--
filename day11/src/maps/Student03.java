package maps;

import java.util.Objects;

public class Student03 {
    private String name;
    private int age;

    public Student03() {
    }

    public Student03(String name, int age) {
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
        Student03 student03 = (Student03) o;
        return age == student03.age && Objects.equals(name, student03.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
