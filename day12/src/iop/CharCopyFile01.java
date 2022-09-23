package iop;

/*
 * 需求：把模块目录下的问题集锦.txt，复制到day12下面
 * 思路：
 *       1.根据数据源创建字符输入流对象
 *       2.根据目的地创建字符输出流对象
 *       3.读写数据，复制文件（一个字符+一个字符数组）
 *       4.释放资源
 * */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharCopyFile01 {
    public static void main(String[] args) throws Exception {
        //创建字符输入流对象
        InputStreamReader ipr = new InputStreamReader(new FileInputStream("问题集锦.txt"));
        //创建字符输出流对象
        OutputStreamWriter otw = new OutputStreamWriter(new FileOutputStream("day12//问题集锦txt"));

        //读写数据，复制文件（1）
//        int ch;
//        while ((ch=ipr.read()) != -1) {
//            otw.write(ch);
//        }

        //读写数据，复制文件(2)
        char[] chars = new char[1024];
        int len;
        while ((len = ipr.read(chars)) != -1) {
            otw.write( chars,0, len);
        }

        //释放资源
        otw.close();
        ipr.close();
    }
}
