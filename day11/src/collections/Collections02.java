package collections;

/*
 * 需求：ArrayList存储学生对象,使用Collections对Arraylist进行排序
 * 要求：按年龄从小到大排序，年龄相同时，按照名字的字母顺序进行排序
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collections02 {
    public static void main(String[] args) {

        //创建学生类

        //创建ArrayList对象
        ArrayList<StudenColls> arrayList = new ArrayList<>();
        //创建学生对象，并添加到ArrayList中
        StudenColls st1 = new StudenColls("zhangsan", 20);
        StudenColls st2 = new StudenColls("lisi", 23);
        StudenColls st3 = new StudenColls("wangwu", 21);
        StudenColls st4 = new StudenColls("tangwu", 21);

        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);

        //对ArrayList进行排序
        Collections.sort(arrayList, new Comparator<StudenColls>() {
            @Override
            public int compare(StudenColls s1, StudenColls s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        //遍历ArrayList集合
        for (StudenColls s : arrayList) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
