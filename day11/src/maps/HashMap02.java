package maps;

/*
* Map集合的遍历方式2:
* 思路：
*       1.获取所有键值对对象的集合
*           Set<Map.Entry<K,V>> entrySet(),获取所有的键值对对象的集合
*       2.遍历键值对对象的集合，得到每一个键值对对象
*           用增强for实现，得到每一个Map.Entry
*       3.根据键值对对象获取键和值
*           用getKey()得到键
*           用getValue()得到值
* */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap02 {
    public static void main(String[] args) {
        //创建Map集合
        Map<String, String> map = new HashMap<String, String>();
        //为Map集合添加对象
        map.put("张明", "张敏");
        map.put("李二", "李三");
        map.put("赵四", "赵五");
        //遍历Map集合
        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> mn : entrySet) {
            String key = mn.getKey();
            String value = mn.getValue();
            System.out.println(key + "," + value);
        }
    }
}
