package maps;

/*
 *需求：创建一个HashMap集合，键是学生对象(student),值是居住地(String),存储
 *       多个键值对元素，并遍历
 * 要求：
 *       保证键的唯一性，如果学生对象的成员变量值相同，就认为是同一个对象
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap04 {

    public static void main(String[] args) {

        //创建学生类

        //创建HashMap对象
        HashMap<Student03, String> hashMap = new HashMap<>();
        //创建学生对象，并添加到集合
        Student03 st1 = new Student03("张三", 20);
        Student03 st2 = new Student03("李四", 23);
        Student03 st3 = new Student03("王五", 22);
        Student03 st4 = new Student03("王五", 22);

        hashMap.put(st1, "杭州");
        hashMap.put(st2, "合肥");
        hashMap.put(st3, "重庆");
        hashMap.put(st4, "南京");
        //遍历集合（1，2）
        Set<Student03> keySet = hashMap.keySet();

        for (Student03 key : keySet) {
            String value = hashMap.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }

        System.out.println("-------------------");
        Set<Map.Entry<Student03, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Student03, String> hmap : entrySet) {
            Student03 key = hmap.getKey();
            String value = hmap.getValue();
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
    }

}
