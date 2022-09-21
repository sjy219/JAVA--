package collections;

import java.util.HashSet;

/*
* 需求：创建一个存储学生对象的集合，存储多个学生对象，使用程序在控制台遍历该集合
*       要求：学生对象成员变量相同，我们就认为是同一个对象
* 思路：
*       1.定义学生类
*       2.创建HashSet集合对象
*       3.创建学生对象
*       4.把学生对象添加到集合
*       5.遍历集合
*
* */

public class HashSets {
    public static void main(String[] args) {
        //创建HashSet集合对
        HashSet<StudenHas> hs = new HashSet<StudenHas>();
        //创建学生对象
        StudenHas s1 = new StudenHas("李浩", 20);
        StudenHas s2 = new StudenHas("张敏", 20);
        StudenHas s3 = new StudenHas("孙强", 50);
        StudenHas s4 = new StudenHas("孙强", 30);
        //添加学生对象到集合中
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        //遍历集合
        for (StudenHas s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
