package maps;

/*
* 需求：键盘录入一个字符串，统计字符串中每个字符出现的次数
*   举例：键盘输入“aabbcc"       控制台输出：a(2)b(2)c(2)
*
* 思路：
*       1.键盘录入一个字符串
*       2.创建HashMap集合，键是Character,值是Interger
*       3.遍历字符串，得到每一个字符
*       4.拿得到的每一个字符作为键到HashMap中去找对应的值，看其返回值
*       5.如果上面的返回值为null，则让值为1，否则值++,并存入集合中
* */

import java.util.*;

public class HashMap07 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner ins = new Scanner(System.in);
        String s = ins.next();
        //创建HashMap集合，键是Character,值是Interger
        //HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        //为了实现输出结果的自然排序，使用TreeMap
        TreeMap<Character, Integer> hashMap = new TreeMap<Character, Integer>();
        //遍历字符串，得到每一个字符
        //拿得到的每一个字符作为键到HashMap中去找对应的值，看其返回值
        //如果上面的返回值为null，则让值为1，否则值++,并存入集合中
        int index;      //建立一个值的索引
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            Integer value = hashMap.get(key);
            if (null == value) {
                value = 1;
                hashMap.put(key, value);
            } else {
                value++;
                hashMap.put(key, value);
            }
        }

        //遍历集合
        StringBuilder builder = new StringBuilder();
        Set<Map.Entry<Character, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<Character, Integer> hp : entrySet) {
            Character key = hp.getKey();
            Integer value = hp.getValue();
            builder.append(key).append('(').append(value).append(')');
        }
        String s1 = builder.toString();
        System.out.println(s1);
    }
}
