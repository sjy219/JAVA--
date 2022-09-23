package iop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
* 需求：使用BufferedReader和BufferedWriter的新特性，复制该目录下的问题集锦.txt到day12下
* 思路：
*   1.创建字符输入流对象BufferedReader(Reader in)
*   2.创建字符输出流对象BufferedWriter(Writer out)
*   3.读写数据，复制文件
*   4.释放资源
*
* */
public class CharCopyFile03 {
    public static void main(String[] args) throws Exception{
        //创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("问题集锦.txt"));
        //创建字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("day12//问题集锦.txt"));
        //读写数据，复制文件
        String lines;
        while ((lines=br.readLine()) != null) {
            bw.write(lines);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        br.close();
        bw.close();
    }
}
