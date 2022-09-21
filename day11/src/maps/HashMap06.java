package maps;

/*
* 需求：创建一个HashMap集合，存储三个键值对元素,每一个键值对的键是String，值是ArrayList
*       每一个ArrayList元素是String，并遍历
* */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap06 {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();
        //创建ArrayList集合，并添加数据到Map集合
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        hashMap.put("0001", list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("唐三");
        list2.add("唐四");
        list2.add("唐五");
        hashMap.put("0002", list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("杨三");
        list3.add("杨四");
        list3.add("杨五");
        hashMap.put("0003", list3);
        //遍历Map集合
        Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            System.out.println(key);
            ArrayList<String> values = hashMap.get(key);
            for (String value : values) {
                System.out.println('\t' + value);
            }
        }
        System.out.println("----------------------------");
        Set<Map.Entry<String, ArrayList<String>>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, ArrayList<String>> hp : entrySet) {
            String key = hp.getKey();
            ArrayList<String> values = hp.getValue();
            System.out.println(key);
            for (String value : values) {
                System.out.println('\t' + value);
            }
        }
    }
}
