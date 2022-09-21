package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collections01 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(50);
        list.add(2);
        list.add(100);
        list.add(45);

        Collections.sort(list);
        System.out.println(list);
        System.out.println("-----------------");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("-------------------");
        Collections.shuffle(list);
        System.out.println(list);

    }
}
