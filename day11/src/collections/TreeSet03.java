package collections;

/*
* 存储学生对象并遍历，创建TreeSet集合使用无参构造方法
* 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排列
* */

import java.util.TreeSet;

public class TreeSet03 {
    public static void main(String[] args) {
        //创建学生类

        //创建TreeSet集合，使用无参构造方法
        TreeSet<Student03> st3 = new TreeSet<Student03>();
        //创建学生对象，并添加到集合中
        Student03 s1 = new Student03("lixiaolan", 20);
        Student03 s2 = new Student03("zhangmingming", 21);
        Student03 s3 = new Student03("tanger", 20);
        Student03 s4 = new Student03("sunqiang", 22);

        st3.add(s1);
        st3.add(s2);
        st3.add(s3);
        st3.add(s4);
        //遍历集合
        for (Student03 s : st3) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
