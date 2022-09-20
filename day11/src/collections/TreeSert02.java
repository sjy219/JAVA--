package collections;


import java.util.Comparator;
import java.util.TreeSet;

/*
 * 需求：
 *       用TreeSet集合存储多个学生的信息（姓名，语文成绩，数学成绩），并遍历集合
 *       要求：按照成绩总分由高到底排列
 * 思路：
 *       1.定义学生类
 *       2.创建TreeSet集合对象，通过比较器排序进行排序
 *       3.创建学生对象
 *       4.把学生对象添加到集合
 *       5.遍历集合
 * */
public class TreeSert02 {
    public static void main(String[] args) {
        //定义学生类
        //创建TreeSet集合+比较器
        TreeSet<Students02> st = new TreeSet<Students02>(new Comparator<Students02>() {
            @Override
            public int compare(Students02 s1, Students02 s2) {
                int num = s2.sum() - s1.sum();
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });
        //创建学生对象
        Students02 s1 = new Students02("杨晓丽", 90, 20);
        Students02 s2 = new Students02("唐浩", 50, 50);
        Students02 s3 = new Students02("陈明", 40, 30);
        Students02 s4 = new Students02("顾兰芝", 60, 10);
        Students02 s5 = new Students02("刘娟", 60, 10);
        //把学生对象添加到集合
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        //遍历集合
        for (Students02 s : st) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMaths() + "," + s.sum());
        }
    }
}
