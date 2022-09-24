package copy;

import java.io.*;

/*
 * 需求：把shiyanlou下面的cast复制到day12下
 * 思路：
 *   1.创建数据源File对象，路径是：cast
 *   2.创建目的地File对象，路径是day12
 *   3.写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
 *   4.判断数据源File是否是目录
 *       是：
 *           1.在目的地下创建和数据源File对象一样的目录
 *           2.获取数据源File下所有文件或者目录的File数组
 *           3.遍历该File数组，得到每一个File对象
 *           4.把该File作为数据源File对象，递归调用复制文件夹的方法
 *       不是：说明是文件，直接复制，用字节流
 * */

public class CopyTri {
    public static void main(String[] args) throws Exception {
        File srcFile = new File("cast");
        File tarFile = new File("day12");
        copyDirectory(srcFile, tarFile);
    }

    public static void copyDirectory(File sFile, File tFile) throws Exception {
        if (sFile.isDirectory()) {
            String sDname = sFile.getName();
            File tDname = new File(tFile, sDname);
            if (!tDname.exists()) {
                tDname.mkdir();
            }
            File[] sListFiles = sFile.listFiles();

            for (File ss : sListFiles) {
                copyDirectory(ss, tDname);
            }
        } else {
            //如果是文件，就需要拼接文件名和路径
            File newFile = new File(tFile, sFile.getName());
            copyFile(sFile, newFile);
        }
    }

    public static void copyFile(File src, File target) throws Exception {
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(target));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bi.read(bytes)) != -1) {
            bo.write(bytes, 0, len);
        }
        bi.close();
        bo.close();
    }
}
