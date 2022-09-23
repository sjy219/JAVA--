package iop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferRW01 {
    public static void main(String[] args) throws Exception {
        //利用BufferedReader(Reader in)创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("day12//f0.txt"));
        //利用BufferedWriter(Write out)创建字符输出流对象
        //BufferedWriter bw = new BufferedWriter(new FileWriter("day12//f0.txt"));

        //测试读字符
//        bw.write("hello");
//        bw.write("hello");

        //测试读数据(1)
//        int ch;
//        while ((ch=br.read()) != -1) {
//            System.out.print((char)ch);
//
//        }

        //测试读数据(2)
        char[] chars = new char[1024];
        int len;
        while ((len= br.read(chars)) != -1) {
            //new String来转换字节或者字符
            System.out.println(new String(chars, 0, len));
        }

        //释放资源
        //bw.close();
        br.close();
    }
}
