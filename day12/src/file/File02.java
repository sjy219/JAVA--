package file;

/*
* File类创建功能
*   public boolean createNewFile()  当具有该名称的文件不存在时，创建一个由此抽象路径命名的新空文件
*           如果文件存在，返回false, 否则返回true
*   public boolean mkdir()          创建由此抽象路径名命名的目录
* *           如果目录存在，返回false, 否则返回true
*   public boolean mkdirs()         创建由此抽象路径名命名的目录，包括任何必须但不存在的父目录
* *           如果目录存在，返回false, 否则返回true
* */


import java.io.File;
import java.io.IOException;

public class File02 {
    public static void main(String[] args) throws IOException {
        String path = "D://java//Projects//002//ShiYanLou//";
        //public boolean createNewFile()
        File f1 = new File(path + "java.txt");
        System.out.println(f1.createNewFile());

        //public boolean mkdir()
        File f2 = new File(path + "Javasee");
        System.out.println(f2.mkdir());

        //public boolean mkdirs() 创建多级目录
        File f3 = new File(path + "Javaweb//Html");
        System.out.println(f3.mkdirs());
    }
}
