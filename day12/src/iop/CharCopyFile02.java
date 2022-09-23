package iop;

/*
 * 需求：把该目录下的问题集锦.txt复制到day12下面（改进版）
 * 思路：
 *       1.简化转换流OutPutSreamReader和InputStreamRead
 *       2.FileReader(String Name): 用于读取字符文件的便捷类
 *       3.FileWriter(String Name): 用于写入字符文件的便捷类
 *       4.数据源和目的地的分析
 *          数据源：shiyanlou//问题集锦.txt->读数据->Reader->InputStreamReader->FileReader
 *          目的地：day12//问题集锦.txt->写数据->Writer->OutPutStreamWrite->FileWriter
 *
 * */

import java.io.FileReader;
import java.io.FileWriter;

public class CharCopyFile02 {
    public static void main(String[] args) throws Exception{

        //创建字符输入流对象
        FileReader fr = new FileReader("问题集锦.txt");
        //创建字符输出流对象
        FileWriter fw = new FileWriter("day12//问题集锦.txt");
        //读写数据，复制文件(1)
//        int ch;
//        while ((ch=fr.read()) != -1) {
//            fw.write(ch);
//        }


        //读写数据，复制文件(2)
        char[] chars = new char[1024];
        int len;
        while ((len=fr.read(chars)) != -1) {
            fw.write(chars,0,len);
        }
        //释放资源
        fr.close();
        fw.close();

    }
}
