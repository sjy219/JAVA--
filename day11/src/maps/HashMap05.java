package maps;

/*
 * 需求：创建一个ArrayList集合，存储三个元素，每一个元素都是一个HashMap集合，
 *       每一个HashMap的键值对都是String，并遍历
 * */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap05 {
    public static void main(String[] args) {
        //创建一个ArrayList集合
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        //创建三个HashMap集合，并添加到ArrayList中
        HashMap<String, String> hashMap1 = new HashMap<String, String>();
        hashMap1.put("张三", "张二");
        hashMap1.put("张四", "张五");
        hashMap1.put("张六", "张七");
        arrayList.add(hashMap1);

        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put("李三", "李二");
        hashMap2.put("李四", "李五");
        hashMap2.put("李六", "李七");
        arrayList.add(hashMap2);

        HashMap<String, String> hashMap3 = new HashMap<String, String>();
        hashMap3.put("王三", "王二");
        hashMap3.put("王四", "王五");
        hashMap3.put("王六", "王七");
        arrayList.add(hashMap3);
        //遍历ArrayList集合
        for (HashMap<String, String> hmp : arrayList) {
            Set<String> keySet = hmp.keySet();
            for (String key : keySet) {
                String value = hmp.get(key);
                System.out.println(key + "," + value);
            }
            System.out.println("--------");
        }
        System.out.println("----------------------------------");
        //遍历方法2
        for (HashMap<String, String> hmap : arrayList) {
            Set<Map.Entry<String, String>> entrySet = hmap.entrySet();
            for (Map.Entry<String, String> hm : entrySet) {
                String key = hm.getKey();
                String value = hm.getValue();
                System.out.println(key + "," + value);
            }
            System.out.println("-----");
        }

    }
}
