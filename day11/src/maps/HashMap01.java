package maps;

/*
* Map集合的遍历（方式1）：
*   1.获取所有键的集合，用keySet()方法实现
*   2.遍历键的集合，获取每一个键，用增强for实现
*   3.根据键找值，用get(object key)实现
*
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("张明", "张敏");
        map.put("李二", "李三");
        map.put("赵四", "赵五");

        //获取所有键的集合
        Set<String> kset = map.keySet();

        //遍历键的集合
        for (String s : kset) {
            //根据键找值
            String s2 = map.get(s);
            System.out.println(s + "," + s2);
        }
    }
}
