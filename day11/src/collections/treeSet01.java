package collections;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

/*
* 要求：
*       编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出
* 思路：
*       1.创建set集合对象
*       2.创建随机数对象
*       3.判断集合的长度是不是小于10
*           是：产生一个随机数 ，并添加到集合
*           回到3继续
*       4.遍历集合
* */

public class treeSet01 {
    public static void main(String[] args) {

        //创建随机数对象
        Random rm = new Random();
        //创建treeSet对象，可以设置Comparator比较器
        TreeSet<Integer> its = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a1, Integer a2) {
                int num = a2 - a1;
                return num;
            }
        });
        //判断集合的长度是不是小于10
        while (its.size() < 10) {
            //产生随机数并添加到集合
            int rms = rm.nextInt(20) + 1;
            its.add(rms);
        }

        //遍历集合1
        for (Integer i : its) {
            System.out.println(i);
        }

    }
}
