import java.util.*;

public class TestArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("wold");
        list.add("Nice girl");

        for (String str1 : list) {
            System.out.println("str1: " + str1);
        }

        String[] str2 = new String[list.size()];
        list.toArray(str2);
        for (int i = 0; i < str2.length; i++) {
            System.out.println("str2: " + str2[i]);
        }

        Iterator<String> str3 = list.iterator();
        while (str3.hasNext()) {
            System.out.println("str3: " + str3.next());
        }
    }
}