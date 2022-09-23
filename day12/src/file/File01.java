package file;

import java.io.File;

/*
* 构造方法：
*       File(String pathname)
*       File(String parent, String child)
*       File(File parent, String child)
* */

public class File01 {
    public static void main(String[] args) {
        //使用File(String pathname)
        File f1 = new File("D://java//Projects//002//ShiYanLou//问题集锦.txt");
        System.out.println(f1);
        System.out.println("------------------");
        //使用File(String parent, String child)
        File f2 = new File("D://java//Projects//002", "ShiYanLou//问题集锦.txt");
        System.out.println(f2);
        System.out.println("----------------");
        //使用File(File parent, String child)
        File f3 = new File("D:\\java\\Projects\\002\\ShiYanLou");
        File f4 = new File(f3, "问题集锦.txt");
        System.out.println(f4);
    }

}
