package collections;


/*
 * 需求：通过程序实现模拟斗地主，实现洗牌，发牌，看牌
 * 要求：对看到的牌面进行排序
 * 思路：
 *       1.创建HashMap，键是编号，值是牌
 *       2.创建ArrayList存储编号
 *       3.创建花色数组和点色数组
 *       4.从0开始往HashMap存储编号，并存储对应的牌，同时往ArrayList存储编号
 *       5.洗牌（洗的是编号），用Collections的shuffle()方法实现
 *       6.发牌（发的也是编号），为了保证编号是排序的，创建TreeSet集合接收
 *       7.定义看牌方法（遍历TreeSet集合，获取编号，到HashMap中找对应的牌）
 *       8.调用看牌方法
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class CollectionSPoker2 {
    public static void main(String[] args) throws InterruptedException {
        //创建HashMap，键是编号，值是牌
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        //创建ArrayList存储编号
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //创建花色数组和点色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] points = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //从0开始往HashMap存储编号，并存储对应的牌，同时往ArrayList存储编号
        //这里花色和点数内外循环结果不同？？？？
        int inde = 0;
        for (String poin : points) {
            for (String col : colors) {
                String poker = col + poin;
//                System.out.println(poker);
//                Thread.sleep(5000);
                hashMap.put(inde, poker);
                arrayList.add(inde);
                inde++;
            }
        }

//        for (String col : colors) {
//            for (String poin : points) {
//                String poker = col + poin;
//                System.out.println(poker);
//                Thread.sleep(5000);
//                hashMap.put(inde, poker);
//                arrayList.add(inde);
//                inde++;
//            }
//        }

        hashMap.put(inde, "小王");
        arrayList.add(inde);
        inde++;
        hashMap.put(inde, "大王");
        arrayList.add(inde);

        //洗牌（洗的是编号），用Collections的shuffle()方法实现
        Collections.shuffle(arrayList);

        //发牌（发的也是编号），为了保证编号是排序的，创建TreeSet集合接收
        TreeSet<Integer> player1 = new TreeSet<Integer>();
        TreeSet<Integer> player2 = new TreeSet<Integer>();
        TreeSet<Integer> player3 = new TreeSet<Integer>();
        TreeSet<Integer> underPoker = new TreeSet<Integer>();

        for (int i = 0; i < arrayList.size(); i++) {
            int poker1 = arrayList.get(i);
            if (i >= arrayList.size() - 3) {
                underPoker.add(poker1);
            } else if (i % 3 == 0) {
                player1.add(poker1);
            } else if (i % 3 == 1) {
                player2.add(poker1);
            } else if (i % 3 == 2) {
                player3.add(poker1);
            }
        }

        //定义看牌方法（遍历TreeSet集合，获取编号，到HashMap中找对应的牌）
        //调用看牌方法
        check("player1", player1, hashMap);
        check("player2", player2, hashMap);
        check("player3", player3, hashMap);
        check("底牌", underPoker, hashMap);
    }

    //看牌方法
    public static void check(String name, TreeSet<Integer> its, HashMap<Integer, String> hmp) {
        System.out.print(name + "的牌面为：");
        for (Integer key : its) {
            String value = hmp.get(key);
            System.out.print(value);
        }
        System.out.println();
    }
}
