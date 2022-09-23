package file;

/*
 * public boolean isDirectory()      测试此抽象路径名表示的File是否为目录
 * public boolean isFile()           测试此抽象路径名表示的File是否为文件
 * public boolean exists()           测试此抽象路径名表示的File是否存在
 * public String getAbsolutePath()   返回此抽象路径名的绝对路径名字符串
 * public String getPath()           将此抽象路径名转换为路径名字符串
 * public String getName()           返回此抽象路径表示的文件或目录的名称
 * public String[] list()            返回此抽象路径名表示的目录中的文件或目录的名称字符串数组
 * public File[] listFile()          返回此抽象路径名表示的目录下的文件或目录的File对象数组
 * */

import java.io.File;

public class File03 {
    public static void main(String[] args) {
        //public String[] list()返回此抽象路径名表示的目录中的文件或目录的名称字符串数组
        String path = "D://java//Projects//002//ShiYanLou//";
        File f1 = new File(path);
        String[] sArray = f1.list();
        for (String s : sArray){
            System.out.println(s);
        }
        System.out.println("--------------");

        File[] fArray = f1.listFiles();
        for (File ff : fArray) {
//            System.out.println(ff);
//            System.out.println(ff.getName());
            if (ff.isFile()) {
                System.out.println(ff.getName());
            }
        }
    }
}
