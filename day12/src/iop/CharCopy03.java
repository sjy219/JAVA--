package iop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 需求：复制该目录下的问题集锦.txt到day12下（BufferedReader和BufferedWriter)
 * 思路：
 *   1.创建字符输入流对象（BufferedReader(Reader in))
 *   2.创建字符输出流对象(BufferedWriter(Writer out))
 *   3.读写数据，复制文件（一个字符+一个字符数组）
 *   4.释放资源
 * */
public class CharCopy03 {
    public static void main(String[] args) throws Exception {

//    创建字符输入流对象（BufferedReader(Reader in))
        BufferedReader br = new BufferedReader(new FileReader("问题集锦.txt"));
//    创建字符输出流对象(BufferedWriter(Writer out))
        BufferedWriter bw = new BufferedWriter(new FileWriter("day12//问题集锦.txt"));

//    读写数据，复制文件（一个字符）
//        int ch;
//        while ((ch= br.read()) != -1) {
//            bw.write(ch);
//        }
        //读写数据（+一个字符数组）
        char[] chars = new char[1024];
        int len;
        while ((len = br.read(chars)) != -1) {
            bw.write(chars, 0, len);
        }

//    释放资源
        br.close();
        bw.close();
    }
}
