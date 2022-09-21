package collections;

import java.util.ArrayList;
import java.util.Collections;

/*
* 需求：通过程序实现斗地主过程中的洗牌，发牌和看牌
* 思路：
*       1.创建一个牌盒，也就是定义一个集合对象，用ArrayList集合来实现
*       2.往牌盒里装牌
*       3.洗牌，也就是把牌的顺序打乱，用Collections中的shuffle()方法实现
*       4.发牌，也就是遍历集合，给三个玩家发牌
*       5.看牌，也就是三个玩家分别遍历自己的牌
* */

public class CollectionsPoker {
    public static void main(String[] args) {
        //创建ArrrayList集合
        ArrayList<String> arrayList = new ArrayList<>();

        //建立两个数组存储花色和点数
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] points = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //组合花色和点数，然后写入arraylist集合
        for (String col : colors) {
            for (String poi : points) {
                String poker = col + poi;
                arrayList.add(poker);
            }
        }
        arrayList.add("小王");
        arrayList.add("大王");
        //打乱排序
        Collections.shuffle(arrayList);

        //建立四个arraylist集合，三个玩家使用，一个底牌
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> underPoker = new ArrayList<String>();
        //发牌
        for (int i = 0; i < arrayList.size(); i++) {
            if (i >= arrayList.size() - 3) {
                underPoker.add(arrayList.get(i));
            } else if (i % 3 == 0) {
                player1.add(arrayList.get(i));
            } else if (i % 3 == 1) {
                player2.add(arrayList.get(i));
            } else if (i % 3 == 2) {
                player3.add(arrayList.get(i));
            }
        }
        //遍历3个玩家的牌，看牌
        check("player1", player1);
        check("player2", player2);
        check("player3", player3);
        check("底牌", underPoker);
    }
    //看牌方法
    public static void check(String s, ArrayList<String> array) {
        System.out.print(s + "牌面为： ");
        for (String sar : array) {
            System.out.print(sar);
        }
        System.out.println();
    }
}
