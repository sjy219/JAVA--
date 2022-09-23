package iop;

/*
 * FileInputStream
 *   从文件输入流中读取数据的三种方式：
 *   public int read() 一次读取一个字节，读到文件末尾，返回值为-1
 *   public int read(byte[] b) 一次读取一个字节数组的字节，读到文件末尾，返回值为-1
 *   public int read(byte[] b, int off, len)
 * */

import java.io.FileInputStream;

public class FileInputStream01 {
    public static void main(String[] args) throws Exception {
        //创建文件输入流对对象
        FileInputStream fio = new FileInputStream("day12//f0.txt");

        //public int read()一次读取一个字节
//        int by;
//        while ((by = fio.read()) != -1) {
//            System.out.print((char) by);
//        }

        //public int read(byte[] b)一次读取一个字节数组
        byte[] bytes = new byte[1024];
        int len;
        while ((len=fio.read(bytes)) !=-1) {
            //new String把字节数组转换成字符串，类似string.getbytes()
            System.out.println(new String(bytes, 0, len));
        }

        fio.close();
    }
}
