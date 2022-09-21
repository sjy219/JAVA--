package maps;

/*
 * 需求：创建一个HashMap集合，键是学号（String),值是学生对象(Students),存储三个键值对元素，并遍历
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap03 {
    public static void main(String[] args) {
        //创建学生类

        //创建HashMap集合
        HashMap<String, Student03> hmp = new HashMap<>();
        //创建学生对象,并添加到集合
        Student03 st1 = new Student03("李四", 20);
        Student03 st2 = new Student03("张三", 22);
        Student03 st3 = new Student03("王五", 23);

        hmp.put("001", st1);
        hmp.put("002", st2);
        hmp.put("003", st3);

        //遍历Map集合

        Set<Map.Entry<String, Student03>> entrySet = hmp.entrySet();
        for (Map.Entry<String, Student03> maps : entrySet) {
            String key = maps.getKey();
            Student03 value = maps.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
        System.out.println("-----------------------");
        //遍历集合2:
        Set<String> keySet = hmp.keySet();
        for (String key : keySet) {
            Student03 value = hmp.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}
