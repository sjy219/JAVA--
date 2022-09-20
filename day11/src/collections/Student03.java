package collections;

public class Student03 implements Comparable<Student03>{
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
    public int compareTo(Student03 s) {
        int num = this.age - s.age;
        int num2 = num==0?this.name.compareTo(s.name):num;
        return num2;
    }
}
