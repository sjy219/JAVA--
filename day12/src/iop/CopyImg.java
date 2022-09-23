package iop;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 需求：把ShiYanLou下面的13.jpg复制到day12下面
 * 思路：
 *       1.根据数据源创建字节输入流对象
 *       2.根据目的地创建字节输出流对象
 *       3.读写数据，复制图片（一次读取一个一个字节数组，一次写入一个字节数组）
 *       4.释放资源
 *
 * */
public class CopyImg {

    public static void main(String[] args) throws Exception {
        //根据数据源创建字节输入流对象
        FileInputStream fio = new FileInputStream("13.jpg");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("day12//13.jpg");
        //读写数据，复制图片（一次读取一个一个字节数组，一次写入一个字节数组）
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fio.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        //释放资源
        fio.close();
        fos.close();
    }
}
