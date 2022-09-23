package iop;

/*
*需求： 把ShiYanLou下面的“问题集锦.txt",复制到day12目录下
*       数据源：
*           D://java//project//02/ShiYanLou//问题集锦.txt->读数据->InputStream->FIleInputStream
*       目的地：
*           ShiYanLou//day12//问题集锦.txt->写数据->OutPutStream->FileOutPutStream
*思路：
*   1.根据数据源创建字节输入流对象
*   2.根据目的地创建字节输出流对象
*   3.读写数据，复制文本文件（一次读取一个字节，一次写入一个字节）
*   4.释放资源
* */

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoRead01 {
    public static void main(String[] args) throws Exception{
        //创建文件输入流
        FileInputStream fio = new FileInputStream("问题集锦.txt");
        //创建文件输出流
        FileOutputStream fos = new FileOutputStream("day12//问题集锦.txt");
        //复制文件
        int by;
        while ((by=fio.read()) != -1) {
            fos.write(by);
        }
        //释放资源
        fos.close();
        fio.close();
    }
}
