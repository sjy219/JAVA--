package file;

/*
 * 需求：
 *   给定一个路径，通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出到控制台上
 * */

import java.io.File;

public class FIle04 {
    public static void main(String[] args) {
        File file = new File("D://java//Projects//002//ShiYanLou//day11");
        recu(file);
    }

    public static void recu(File srcFile) {

        File[] fArray = srcFile.listFiles();
        if (fArray != null) {
            for (File fs : fArray) {
                if (fs.isDirectory()) {
                    recu(fs);
                } else {
//                    System.out.println(fs.getAbsolutePath());
                    System.out.println(fs);
                }
            }
        }
    }
}
